package com.zj.javabasic.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.date
 * @className: Demo
 * @author: By zhangjun
 * @description: TODO
 * @date: 2023/11/16 8:45
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {

        for (int i=0;i<300;i++){
            Date date = randomDate("2019-01-01","2023-10-31");
            System.out.println(new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(date));
        }
    }
    private static Date randomDate(String beginDate,String endDate){
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date start = format.parse(beginDate);
            Date end = format.parse(endDate);

            if(start.getTime() >= end.getTime()){
                return null;
            }
            long date = random(start.getTime(),end.getTime());
            return new Date(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static long random(long begin,long end){
        long rtn = begin + (long)(Math.random() * (end - begin));
        if(rtn == begin || rtn == end){
            return random(begin,end);
        }
        return rtn;
    }

}
