package com.zj.javabasic.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.thread
 * @className: ThreadDemo
 * @author: By zhangjun
 * @description: TODO
 * @date: 2023/12/1 8:33
 * @version: 1.0
 */
public class ThreadDemo extends Thread{
    private final static Logger logger = LoggerFactory.getLogger(ThreadDemo.class);

    @Override
    public void run() {
        logger.info("原神启动");
    }
    public void waitThread(){
        //ctrl alt t快捷键
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * 持有锁才能调用wait方法
     */
    public void waitSynThread(){
        //ctrl alt t快捷键
        try {

            synchronized (this) {
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * 持有锁才能调用wait方法
     */
    public void notufySynThread(){
        //ctrl alt t快捷键
        try {
            synchronized (this) {
                this.notify();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            ThreadDemo threadDemo = new ThreadDemo();
            //threadDemo.waitThread();
            if (i % 2 == 1) {
                threadDemo.waitSynThread();
            }
            System.out.println(i);
            threadDemo.start();
            threadDemo.notufySynThread();
        }
    }
}
