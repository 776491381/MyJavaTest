package cn.fyy.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by FYY on 7/22/16.
 */
public class URLtest2 {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");
        InputStream is = url.openStream();//通过URL的openstream获取url对象所表示的资源字节输入流
        InputStreamReader isr = new InputStreamReader(is,"utf-8");
        //添加缓冲
        BufferedReader br = new BufferedReader(isr);
        String data = br.readLine();
        while(data!=null){
            System.out.println(data);
            data=br.readLine();
            ////...
        }
        is.close();
        isr.close();
        br.close();


    }
}
