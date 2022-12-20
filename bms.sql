/*
 Navicat Premium Data Transfer

 Source Server         : LyhZzz
 Source Server Type    : MySQL
 Source Server Version : 80030 (8.0.30)
 Source Host           : localhost:3306
 Source Schema         : bms

 Target Server Type    : MySQL
 Target Server Version : 80030 (8.0.30)
 File Encoding         : 65001

 Date: 20/12/2022 21:29:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `admin_id` int NOT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', '123456');

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `bookid` int NOT NULL AUTO_INCREMENT,
  `bookname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `author` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `publish` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `introduction` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `classid` int NULL DEFAULT NULL,
  `number` int NULL DEFAULT NULL,
  `bookimg` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`bookid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, '丁真的一天', '丁真', '理塘出版社', '丁真的一天', 3, 96, NULL);
INSERT INTO `book` VALUES (2, '数据库系统概论', '丁真', '理塘出版社', '数据库', 1, 996, NULL);
INSERT INTO `book` VALUES (3, '重生之我是丁真', '丁真', '纯真出版社', '扎西德勒', 3, 14, NULL);
INSERT INTO `book` VALUES (4, 'SpringBoot', 'Rod Johnson', '纯真出版社', 'springboot', 1, 99, NULL);
INSERT INTO `book` VALUES (5, 'SSM', 'Rod Johnson', 'xx出版社', 'SMM', 1, 99, NULL);
INSERT INTO `book` VALUES (6, 'vue', '鱿鱼须', 'xxx出版社', 'vue', 1, 99, NULL);
INSERT INTO `book` VALUES (7, '我是大飞柱', '顶真', '飞柱出版社', '。。。', 2, 99, NULL);

-- ----------------------------
-- Table structure for classinfo
-- ----------------------------
DROP TABLE IF EXISTS `classinfo`;
CREATE TABLE `classinfo`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `classid` int NULL DEFAULT NULL,
  `classname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of classinfo
-- ----------------------------
INSERT INTO `classinfo` VALUES (1, 1, '科普类');
INSERT INTO `classinfo` VALUES (2, 2, '军事类');
INSERT INTO `classinfo` VALUES (3, 3, '纯真类');
INSERT INTO `classinfo` VALUES (4, 4, '小说');
INSERT INTO `classinfo` VALUES (5, 5, '杂志');
INSERT INTO `classinfo` VALUES (6, 6, '新闻');
INSERT INTO `classinfo` VALUES (7, 7, '其他');

-- ----------------------------
-- Table structure for collectrecord
-- ----------------------------
DROP TABLE IF EXISTS `collectrecord`;
CREATE TABLE `collectrecord`  (
  `collectid` int NOT NULL AUTO_INCREMENT,
  `bookid` int NOT NULL,
  `userid` int NOT NULL,
  `lenddate` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`collectid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of collectrecord
-- ----------------------------
INSERT INTO `collectrecord` VALUES (1, 1, 2, '2022-12-19 09:53:59');
INSERT INTO `collectrecord` VALUES (2, 1, 4, '2022-12-20 21:21:49');
INSERT INTO `collectrecord` VALUES (3, 2, 4, '2022-12-20 21:21:50');
INSERT INTO `collectrecord` VALUES (4, 3, 4, '2022-12-20 21:21:52');
INSERT INTO `collectrecord` VALUES (5, 4, 4, '2022-12-20 21:21:53');
INSERT INTO `collectrecord` VALUES (6, 5, 4, '2022-12-20 21:21:54');
INSERT INTO `collectrecord` VALUES (7, 7, 4, '2022-12-20 21:22:00');
INSERT INTO `collectrecord` VALUES (8, 6, 4, '2022-12-20 21:22:02');

-- ----------------------------
-- Table structure for lendrecord
-- ----------------------------
DROP TABLE IF EXISTS `lendrecord`;
CREATE TABLE `lendrecord`  (
  `lendid` int NOT NULL AUTO_INCREMENT,
  `bookid` int NULL DEFAULT NULL,
  `userid` int NULL DEFAULT NULL,
  `lenddate` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `backdate` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `number` int NULL DEFAULT NULL,
  PRIMARY KEY (`lendid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lendrecord
-- ----------------------------
INSERT INTO `lendrecord` VALUES (1, 2, 2, '2022-12-19 09:54:07', '2023-01-19 09:54:07', 1);
INSERT INTO `lendrecord` VALUES (2, 2, 2, '2022-12-20 20:29:35', '2023-01-20 20:29:35', 1);
INSERT INTO `lendrecord` VALUES (3, 1, 2, '2022-12-20 20:38:44', '2023-01-20 20:38:44', 1);
INSERT INTO `lendrecord` VALUES (4, 1, 4, '2022-12-20 21:21:40', '2023-01-20 21:21:40', 1);
INSERT INTO `lendrecord` VALUES (5, 2, 4, '2022-12-20 21:21:42', '2023-01-20 21:21:42', 1);
INSERT INTO `lendrecord` VALUES (6, 3, 4, '2022-12-20 21:21:44', '2023-01-20 21:21:44', 1);
INSERT INTO `lendrecord` VALUES (7, 4, 4, '2022-12-20 21:21:45', '2023-01-20 21:21:45', 1);
INSERT INTO `lendrecord` VALUES (8, 5, 4, '2022-12-20 21:21:47', '2023-01-20 21:21:47', 1);
INSERT INTO `lendrecord` VALUES (9, 6, 4, '2022-12-20 21:21:57', '2023-01-20 21:21:57', 1);
INSERT INTO `lendrecord` VALUES (10, 7, 4, '2022-12-20 21:21:58', '2023-01-20 21:21:58', 1);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `openid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sex` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `head_img` blob NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `city` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `role` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `id`(`id` ASC, `username` ASC, `password` ASC, `role` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (2, NULL, 'dzzz', 'E10ADC3949BA59ABBE56E057F20F883E', '男', NULL, '18979967283', '景德镇', NULL);
INSERT INTO `user` VALUES (4, NULL, '丁真', 'E10ADC3949BA59ABBE56E057F20F883E', '男', NULL, '12345678911', '理塘', NULL);

SET FOREIGN_KEY_CHECKS = 1;
