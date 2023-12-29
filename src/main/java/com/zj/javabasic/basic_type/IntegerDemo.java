package com.zj.javabasic.basic_type;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.basic_type
 * @className: IntegerDemo
 * @author: By zhangjun
 * @description: TODO
 * @date: 2023/12/27 8:16
 * @version: 1.0
 */
public class IntegerDemo {
    private final static Logger logger = LoggerFactory.getLogger(IntegerDemo.class);
    /**
     *自动装箱和拆箱
     */
    public static void boxxing(){
        int i=10;
        int h=200;
        //使⽤用缓存池中的对象，多次调用只会取同⼀一个对象的引用
        Integer zx=Integer.valueOf(i);
        int cx=zx.intValue();
        logger.info("自动装箱："+zx);
        logger.info("自动拆箱："+cx);
    }
    /**
     * 常量缓存池
     */
    public static void cache(){
        Integer x = new Integer(18);
        Integer y = new Integer(18);
        boolean xy=(x==y) ? true :false;
        logger.info(""+xy);


        Integer z = Integer.valueOf(18);
        Integer k = Integer.valueOf(18);
        boolean zk=(z==k) ? true :false;
        logger.info(""+zk);

        Integer m = Integer.valueOf(300);
        Integer p = Integer.valueOf(300);
        boolean mp=(m==p) ? true :false;
        logger.info(""+mp);


    }
    public static void main(String[] args) {
        boxxing();
        cache();
    }
}
