package com.zj.javabasic.loops;

import com.google.common.base.Joiner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.fors
 * @className: ForDemo
 * @author: By zhangjun
 * @description: for循环
 * @date: 2023/10/20 8:41
 * @version: 1.0
 */
public class ForDemo {
    private final static Logger logger = LoggerFactory.getLogger(ForDemo.class);
    /**
     * 简易for循环
     */
    public static void getForFlow(){
        for (int i = 0; i <20 ; i++) {
            try {
                boolean b = i % 2 == 0;
                int c = i / 0;
                //logger.info("循环变量，i:{}",i);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    /**
     *foreach循环
     */


    public static void main(String[] args) {
       getForFlow();
    }
}
