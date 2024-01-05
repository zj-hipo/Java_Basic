package com.zj.javabasic.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.log
 * @className: LogDemo
 * @author: By zhangjun
 * @description: TODO
 * @date: 2024/1/4 8:17
 * @version: 1.0
 */
public class LogDemo {
    private final static Logger logger = LoggerFactory.getLogger(LogDemo.class);
    public static void testLog(){
        logger.info("开启info日志");
        //假如说 debug() 的时候没有传参，确实是不需要判断 DEBUG 是否启用的。
        if (logger.isDebugEnabled()) {
            logger.debug("debug日志");

        }
    }

    public static void main(String[] args) {
        testLog();
    }
}
