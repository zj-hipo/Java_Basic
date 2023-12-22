package com.zj.javabasic.collections.array;

import java.util.ArrayList;
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
       List<String> s=new ArrayList<>();

       s.add(0,null);
       s.add(1,"1");
       s.add(2,null);
       s.add(3,"1");
       s.add(4,"1");

        List<String> n=new ArrayList<>();

        n.add(0,"2");
        n.add(1,null);
        n.add(2,"2");
        n.add(3,null);
        n.add(4,null);

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i)==null) {
                s.set(i,n.get(i));
            }
        }
        System.out.println(s);
        //List<String> newList = s.stream().filter(e-> null != e).collect(Collectors.toList());
        //System.out.println(newList);
    }
}
