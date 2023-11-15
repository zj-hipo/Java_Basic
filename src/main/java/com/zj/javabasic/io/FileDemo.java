package com.zj.javabasic.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Random;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.io
 * @className: FileDemo
 * @author: By zhangjun
 * @description: File类
 * @date: 2023/11/13 8:44
 * @version: 1.0
 */
public class FileDemo {
    private final static Logger logger = LoggerFactory.getLogger(FileDemo.class);

    /**
     * 判断文件是否存在，不存在创建
     */
    public static void createFile(){
        try{
            File file=new File("D:/Download/HK.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }
    public static void main(String[] args) {
        FileDemo.createFile();

    }
}
