package com.zj.javabasic.random;

import com.zj.javabasic.basic_type.BasicType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.random
 * @className: RandomDemo
 * @author: By zhangjun
 * @description: TODO
 * @date: 2023/11/20 13:53
 * @version: 1.0
 */
public class RandomDemo {
    private final static Logger logger = LoggerFactory.getLogger(RandomDemo.class);
    /**
     * 取值1-100(包含1和100)
     */
    public static int getRadomNum(){
        //取值范围[1,101)
        int radNum=(int) (Math.random()*100+1);
        logger.info("随机取值，random:{}",radNum);
        return radNum;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            RandomDemo.getRadomNum();
        }

    }
}
