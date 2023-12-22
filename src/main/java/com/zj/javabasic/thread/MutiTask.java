package com.zj.javabasic.thread;

import com.zj.javabasic.basic_type.BasicType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.thread
 * @className: MutiTask
 * @author: By zhangjun
 * @description: TODO
 * @date: 2023/11/29 8:25
 * @version: 1.0
 */
public class MutiTask implements Runnable {
    private final static Logger logger = LoggerFactory.getLogger(MutiTask.class);
    @Override
    public void run() {
        try{
            logger.info("===多线程===");
            //Thread.sleep(1000);
        }catch (Exception e){
            logger.error("多线程异常，e:{}",e);
            e.printStackTrace();
        }
    }
}
