# 图书管理系统



## 1. 开发目的<img src = 'https://s3.bmp.ovh/imgs/2021/12/9be773a77c16e439.jpg' width=13% align=right hspace="5" vspace="5" />

实现图书的智能化、信息化和简单化；实现图书信息的增加、删除、修改、查找、借阅、还书、收藏的显示操作及实时数据库的提交和更改和对普通用户的增、删、改、查；提高图书管理员工作信息报送及反馈的工作效率，减轻管理员的劳动负担；提高信息的及时性和汇总统计信息的准确性。

## 2. 主要技术

| 后端技术     | 说明                     |
| ------------ | ------------------------ |
| SpringBoot   | 容器+MVC框架             |
| MyBatis      | ORM框架                  |
| MyBatis-Plus | ORM框架,增强对单表的操作 |
| PageHelper   | MyBatis物理分页插件      |
| Druid        | 数据库连接池             |
| Lombok       | 简化对象封装工具         |
| Hutool       | Java工具类库             |
| JWT          | JWT登录支持              |

| 前端技术 | 说明         |
| -------- | ------------ |
| Vue      | 前端框架     |
| Element  | 前端UI框架   |
| Axios    | 前端HTTP框架 |
| Echarts  | 图表框架     |



## 3. 功能介绍<img src = 'https://s3.bmp.ovh/imgs/2021/12/9be773a77c16e439.jpg' width=10% align=right hspace="5" vspace="5" />

1. **运行** `java  -jar books-0.0.1-SNAPSHOT.jar`
2. **访问**[http://localhost:9999](http://localhost:9999/)
3.  **默认管理员账号/密码** admin/admin (其他用户可自行注册)
4. **项目已部署**[点击访问(ding99.top)](http://ding99.top/)

主要功能:验证码,模糊查询,分页查询,多表联合查询,文件上传,Excel文件导出,管理员对图书,用户进行增删改查,普通用户进行收藏,借阅及取消收藏,借阅,拦截器,日志集成,密码均采用了MD5加密,图形报表.

### 3.1 登录界面

> 实现了验证码和前端初步判定用户名和密码是否合法

![image-20211225204042263](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225204042263.png)



### 3.2 注册页面

> 实现了对用户信息,手机号,密码的初步检验

![image-20211225205030977](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225205030977.png)



![image-20211225205228978](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225205228978.png)



### 3.3 普通用户操作界面

> 普通用户可进行图书管理,借还管理,收藏管理和密码修改,默认首页是图书的借阅排行

![image-20211225215952758](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225215952758.png)



### 3.4 图书管理

#### 3.4.1 图书列表

> 普通用户可模糊查询图书,新建图书,导出图书,对图书进行借阅,收藏

![image-20211225220310001](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225220310001.png)

1. 模糊查询图书

![image-20211225220541968](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225220541968.png)

2. 新建图书

![image-20211225221402963](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225221402963.png)



3. 导出

![image-20211225221513647](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225221513647.png)



![image-20211225221543773](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225221543773.png)



![image-20211225221644131](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225221644131.png)

4. 借阅

![image-20211225221749201](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225221749201.png)

5. 收藏

> 被收藏后的图书,会收藏失败

![image-20211225221821391](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225221821391.png)

#### 3.4.2 分类信息

> 支持分类信息模糊查询,导出和分页查询

![image-20211225222014890](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225222014890.png)

#### 3.4.3 借阅数量

> 实现数据可视化

![image-20211225222113198](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225222113198.png)

### 3.5 借还管理

> 支持图书模糊查询,导出借还记录,图书归还,分页查询,用户只能看见自己的借还记录

![image-20211225222322669](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225222322669.png)

### 3.6 收藏管理

> 支持图书模糊查询,导出收藏记录,图书取消收藏,分页查询,用户只能看见自己的收藏记录

![image-20211225222420033](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225222420033.png)

### 3.7 其他

#### 3.7.1 地图

> 引用百度地图api

![image-20211225222601594](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225222601594.png)

#### 3.4.2 读者分布

> 实现可数据可视化

![image-20211225222703411](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225222703411.png)

### 3.7 修改密码

![image-20211225222735878](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225222735878.png)

> 实现密码加密存储,前端初步验证

![image-20211225222802178](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225222802178.png)



### 3.8 管理员界面

> 读者分布

![image-20211225232231713](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225232231713.png)

### 3.9 读者档案

> 支持读者名称模糊查询,分页查询,导出读者列表,增加,编辑和删除读者

![image-20211225232449604](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225232449604.png)

1. 增加读者

![image-20211225232647729](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225232647729.png)

2. 编辑读者

> 支持数据回显

![image-20211225232744619](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225232744619.png)

3. 删除读者

![image-20211225232830362](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225232830362.png)

### 3.10 图书管理

> 相对普通用户来说,管理员页面增加了对图书的编辑和删除

1. 编辑图书

> 支持数据回显

![image-20211225233033811](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225233033811.png)

### 3.11 借还管理

> 实现了对不同用户借书情况的查询,删除和归还,支持借还记录导出,分页查询

![image-20211225233244396](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225233244396.png)

### 3.12 收藏管理

> 支持查看不同用户的图书收藏情况,支持收藏记录导出

![image-20211225233347318](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225233347318.png)

### 3.13 拦截器功能

> 用户未登录就访问页面时,会进行拦截并跳转到登录页面

![image-20211225233645710](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225233645710.png)

## 4. 项目结构

### 4.1 数据库结构

![image-20211225233841756](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225233841756.png)

| 表名          | 作用     |
| ------------- | -------- |
| book          | 图书     |
| user          | 用户     |
| lendrecord    | 借阅记录 |
| classinfo     | 分类信息 |
| collectrecord | 收藏信息 |

### 4.2 项目结构

![image-20211225234229246](%E7%B3%BB%E7%BB%9F%E8%AF%B4%E6%98%8E.assets/image-20211225234229246.png)

> 前后端交互全部采用JSON数据交互

