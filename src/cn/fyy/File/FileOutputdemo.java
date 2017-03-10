package cn.fyy.File;

import cn.fyy.IOStream.IOUtil;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by FYY on 7/19/16.
 */
public class FileOutputdemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("demo/out.dat");
        out.write('A');
        out.write('B');
        int i = 10;
        out.write(i>>>24);
        out.write(i>>>16);
        out.write(i>>>8);
        out.write(i);
        byte[] gbk = "中国".getBytes("gbk");
        out.write(gbk);
        out.close();
        IOUtil.printHex("demo/out.dat");
    }
}
