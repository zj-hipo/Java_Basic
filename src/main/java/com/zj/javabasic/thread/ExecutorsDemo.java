package com.zj.javabasic.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.thread
 * @className: ExecutorsDemo
 * @author: By zhangjun
 * @description: 使用Executors创建线程池
 * @date: 2023/11/28 8:37
 * @version: 1.0
 */
public class ExecutorsDemo {
    private final static Logger logger = LoggerFactory.getLogger(ExecutorsDemo.class);
    /**
     * FixedThreadPool和SingleThreadPool：允许的请求队列长度为Integer.MAX_VALUE,可能会堆积大量的请求，从而导致OOM。
     * CachedThreadPool和ScheduledThreadPool：允许的创建线程数量为Integer.MAX_VALUE,可能会创建大量的线程，从而导致OOM。
     * 创建一个固定大小的线程池，可控制并发的线程数，超出的线程会在队列中等待；在一个共享的无界队列上运行
     * LinkedBlockingQueue<Runnable>不设置大小，就会变成无界队列，不断添加任务，内存溢出
     */
    private static ExecutorService executorService = Executors.newFixedThreadPool(15);
    public static void getFixedThreadPool(){
        logger.error(Integer.MAX_VALUE+"");
        /**
         * 设置JVM参数  -Xmx8m -Xms8m
         */
        int max=Integer.MAX_VALUE;
        //将20000个任务放到线程的任务队列里(如果是max个，队列就是无界队列)
        //15个线程不断执行这20000个任务
        for (int i = 0; i <5000 ; i++) {
            System.out.println("线程数"+i);
            executorService.execute(new MutiTask());
        }
        executorService.shutdown();
    }

    public static void main(String[] args) {
       getFixedThreadPool();
    }

}
