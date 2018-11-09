package com.zj.asynchttp.utils;

import java.text.SimpleDateFormat;

/**
 * create by zj on 2018/11/9
 */
public class TimeUtils {
    /**
     * 默认日期格式
     */
    private static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";
    /**
     * 把当前时间格式化成yyyy-MM-dd HH:mm:ss
     *
     * @return String
     */
    public static String date() {
        return new SimpleDateFormat(DEFAULT_FORMAT).format(System.currentTimeMillis());
    }

    public static String date(long timeTamp) {
        return new SimpleDateFormat(DEFAULT_FORMAT).format(timeTamp);
    }

}
