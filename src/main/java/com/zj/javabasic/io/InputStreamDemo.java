package com.zj.javabasic.io;

import com.zj.javabasic.fors.ForDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.io
 * @className: InputStreamDemo
 * @author: By zhangjun
 * @description: 字节流-输入流
 * @date: 2023/11/7 8:27
 * @version: 1.0
 */
public class InputStreamDemo {
    private final static Logger logger = LoggerFactory.getLogger(InputStreamDemo.class);

    /**
     * 文件的读取
     */
    public static void readFile() {
        //InputStream是一个抽象类
        try {
            //如果文件不存在，是一个目录而不是一个常规文件，或者由于某些其他原因无法打开读取。抛出异常
            //name:系统的文件路径
            //读取文件是输入流，写文件是输出流
            InputStream inputStream = new FileInputStream("D:\\Download\\output.txt");
            //创建一个字节数组，编码就是把字符转换为字节，而解码是把字节重新组合成字符。
            byte[] b = new byte[1024];
            // 将读取到的数据放在 byte 数组中，该方法实际上调用read(byte b[], int off, int len)方法
            //byte数组设置一次性读取1024个字节
            //Integer a = inputStream.read(b);
            int length=0;
            //a=-1代表没有字节了 while里 如果写成去a！=-1会死循环
            while((length=inputStream.read(b))!=-1){
                logger.info("将字节数组转换为中文:{}", new String(b, "UTF-8"));
            }
            //关闭流
            inputStream.close();
            logger.info("字节数组：{}", Arrays.toString(b));
            //通过String解码字节数组

        } catch (Exception e) {
            logger.info("io异常:{}", e.toString());
        }
    }
    public static void main(String[] args) {
        InputStreamDemo.readFile();
    }

}
