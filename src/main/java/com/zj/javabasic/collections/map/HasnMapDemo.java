package com.zj.javabasic.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: javabasic
 * @description: 填写描述
 * @author: 张军
 * @create: 2019-11-29 13:29
 **/

public class HasnMapDemo {
    private HashMap hashMap;

    public void test() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        //map默认大小情况下，只能放进去大概1291785条数据
        Map<String, Object> map = new HashMap();
        try {
            for (int i = 0; i < 10000000; i++) {
                System.out.println(map.size());
                map.put("" + i, "我问为忘记我骄傲纪委监委经济危机发我份奇偶挖放假哦啊王府井我就偶尔阿加我就饿哦挖掘哦" + i);
            }
        } catch (Exception e) {
            System.out.println(map.size());
            System.out.println("异常" + e);
        }
    }
}
