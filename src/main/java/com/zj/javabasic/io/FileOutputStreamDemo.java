package com.zj.javabasic.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.io
 * @className: FileOutputStreamDemo-字节流
 * @author: By zhangjun
 * @description: TODO
 * @date: 2023/11/24 8:13
 * @version: 1.0
 */
public class FileOutputStreamDemo {
    private final static Logger logger = LoggerFactory.getLogger(FileOutputStreamDemo.class);
    public static void writeByte(File file){
        try {
            //true追加数据，否则覆盖
            FileOutputStream fileOutputStream = new FileOutputStream(file,true);
            String content="周五，放假出去，我我我假按揭我奶问问客服没啥事给了我玩个好玩看似是我还会根据国家二级";
            fileOutputStream.write(content.getBytes());
            //换行
            fileOutputStream.write("\r\n".getBytes());
            fileOutputStream.close();
        }catch (IOException e){
            logger.error("IO异常，e:{}",e.getStackTrace());
        }
    }

    public static void main(String[] args) {
        File file=new File("D:/Download/fileoutput.txt");
        //竟然没有中文乱码
        for (int i = 0; i <100 ; i++) {
            FileOutputStreamDemo.writeByte(file);
        }

    }
}
