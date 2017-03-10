package cn.fyy.Socket;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by FYY on 7/22/16.
 */
public class URLtest {
    public static void main(String[] args) {
        URL url = null;


        try {
            url = new URL("http://www.baidu.com");
              URL url2 = new URL(url,"/index.html");
            System.out.println("端口号:"+url2.getPort());
            System.out.println("协议:"+url2.getProtocol());
            System.out.println("主机:"+url2.getHost());
            System.out.println("文件名:"+url2.getFile());
            System.out.println("文件路径:"+url2.getPath());
            System.out.println("相对路径:"+url2.getRef());
            System.out.println("查询字符串:"+url2.getQuery());//参数


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }


}
