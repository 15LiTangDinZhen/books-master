package com.ding.books.utils;

import com.alibaba.fastjson.JSONObject;


public class JSONUtils {
    /**
     * 转换json对象
     */
    public static JSONObject parseJSONP(String jsonp) {
        int startIndex = jsonp.indexOf("(");
        int endIndex = jsonp.lastIndexOf(")");
        String json = jsonp.substring(startIndex + 1, endIndex);
        return JSONObject.parseObject(json);
    }
}
