package cn.fyy.IOStream;

import sun.nio.cs.ext.GBK;

import java.io.*;

/**
 *
 * 字符流:主要操作文本文件默认gbk
 * inputstreamreader:完成byte流到char流的解析
 * outputstreamWriter:完成char流到byte流得解析
 * Created by FYY on 7/19/16.
 */
public class inputstreamreader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("demo/out3.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("demo/out3co.txt"));
//        int c;
//        while((c = isr.read())!=-1){
//            System.out.print((char)c);
//        }
        char[] buffer = new char[8*1024];
        int c;
        while((c=isr.read(buffer,0,buffer.length))!=-1){
            String s = new String(buffer,0,c);
            osw.write(buffer,0,c);
            osw.flush();
            System.out.println(s);
        }
        osw.close();
        isr.close();
    }
}
