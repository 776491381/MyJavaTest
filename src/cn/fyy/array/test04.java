package cn.fyy.array;

import java.util.ArrayList;

/**
 * Created by FYY on 16/6/11.
 */
public class test04 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();//可变字符序列和stringbuffer一样,初始化长度16
        StringBuilder sb2 = new StringBuilder("www");//初始化16+3位,会自动扩大位数
        sb2.append("sss").append("222");//累加字符串
        System.out.println(sb2);

    }
}
