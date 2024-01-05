package com.zj.javabasic.collections.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.collections.array
 * @className: ArrayDemo
 * @author: By zhangjun
 * @description: TODO
 * @date: 2023/11/30 16:59
 * @version: 1.0
 */
public class ArrayDemo {
    public static void main(String[] args) {
       List<Integer> s=new ArrayList<>();

       s.add(0,1);


        List<Integer> n=new ArrayList<>();


       Integer a= Collections.max(s)+1;
       //Integer b= Collections.max(n)+1;
        System.out.println(a);
        //System.out.println(b);
    }
}
