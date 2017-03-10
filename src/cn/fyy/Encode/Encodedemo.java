package cn.fyy.Encode;

import java.io.UnsupportedEncodingException;

/**
 * Created by FYY on 7/19/16.
 */
public class Encodedemo {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "慕课ABC";
        byte[] by = s.getBytes();//默认是utf-8
        for(byte b :by ){
            System.out.print(Integer.toHexString(b&0xff)+" ");
        }
        byte[] by2 = s.getBytes("gbk");
        System.out.println();
        for(byte b :by2 ){
            System.out.print(Integer.toHexString(b&0xff)+" ");
        }
        byte[] by3 = s.getBytes("utf-8");
        System.out.println();
        for(byte b :by3 ){
            System.out.print(Integer.toHexString(b&0xff)+" ");
        }
        byte[] by4 = s.getBytes("utf-16be");//中文两字节,英文占用两字节
        System.out.println();
        for(byte b :by4 ){
            System.out.print(Integer.toHexString(b&0xff)+" ");
        }
        System.out.println();
        String str1 = new String(by4);
        System.out.println(str1);
        String str2 = new String(by4,"utf-16be");
        System.out.println(str2);
    }
}
