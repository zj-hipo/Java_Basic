package com.zj.javabasic.basic_type;

import com.zj.javabasic.io.InputStreamDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.basic_type
 * @className: BasicType
 * @author: By zhangjun
 * @description: 基本数据类型
 * @date: 2023/11/9 8:12
 * @version: 1.0
 */
public class BasicType {
    private final static Logger logger = LoggerFactory.getLogger(BasicType.class);
    public static void byteOperation(){
        byte a[]=new byte[1024];
        byte ha=22;
        logger.info("ha:{}",ha);
        Byte b=new Byte(ha);
        logger.info("b:{}",b);
        Byte c=new Byte("45");
        logger.info("c:{}",c);
        try {
            logger.info("解码:{}", new String(a, "GBK"));
        }catch (Exception e){
            logger.info("io异常:{}", e.toString());
        }

    }

    public static void main(String[] args) {

        String[] s=new String[]{""};
        logger.info(s.length+"");
        //BasicType.byteOperation();
    }
}
