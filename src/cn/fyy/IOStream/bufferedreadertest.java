package cn.fyy.IOStream;

import java.io.*;

/**
 * 字符流过滤器
 * readline:一次读取一行
 * writeline:一次写一行
 * Created by FYY on 7/19/16.
 */
public class bufferedreadertest {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream("demo/out3.txt")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("demo/out3bufferwriter.txt")));//PrintWriter方法方便

        String line;
        while((line = br.readLine())!=null)
        {
            System.out.println(line);//不会有换行,要单独写出换行操作
            bw.write(line);
            bw.newLine();//换行操作
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
