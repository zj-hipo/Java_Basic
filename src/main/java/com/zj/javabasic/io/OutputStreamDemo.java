package com.zj.javabasic.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Arrays;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.io
 * @className: OutputStreamDemo
 * @author: By zhangjun
 * @description: 字节流-输出流；字节流是一个字节一个字节的输出
 * @date: 2023/11/13 8:16
 * @version: 1.0
 */
public class OutputStreamDemo {
    private final static Logger logger = LoggerFactory.getLogger(OutputStreamDemo.class);
    public static void writeFile(File file) {
        //InputStream是一个抽象类
        try {
            //通过文件路径（或其标识的File对象）来创建文件流
            //若参数值为true，则是“追加数据”。若参数值为false，则“覆盖原有数据”
            OutputStream outputStream=new FileOutputStream(file,true);
            String content="QBZ-171";
            //写入文件
            outputStream.write(content.getBytes());
            //换行
            outputStream.write("\r\n".getBytes());
            //关闭流
            outputStream.close();
        } catch (Exception e) {
            logger.info("io异常:{}", e.toString());
        }
    }

    public static void main(String[] args) {
        File file=new File("D:\\Download\\output.txt");
        for (int i = 0; i <1000 ; i++) {
            OutputStreamDemo.writeFile(file);
        }
        }

}
