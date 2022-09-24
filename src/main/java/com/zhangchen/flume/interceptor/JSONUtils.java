package com.zhangchen.flume.interceptor;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class JSONUtils {
//    public static void main(String[] args) {
//        System.out.println(isJSONValidate("{123456"));
//        System.out.println(isJSONValidate("{\"age\":18}"));
//    }
    // 验证数据是否json
    public static boolean isJSONValidate(String log) {
        try {
            JSON.parse(log);
            return true;
        }catch (JSONException e){
            return false;
        }

    }
}
