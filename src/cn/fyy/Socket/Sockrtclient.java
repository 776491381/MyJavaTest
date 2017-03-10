package cn.fyy.Socket;

import java.io.*;
import java.net.Socket;
import java.nio.Buffer;

/**
 * Created by FYY on 7/22/16.
 */
public class Sockrtclient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",8888);
        //输出流发送信息
       PrintWriter pw = new PrintWriter(socket.getOutputStream());
        pw.write("用户名:admin 密码:123");
        pw.flush();
        socket.shutdownOutput();
        InputStreamReader isr =new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(isr);
        String info = null;
        while((info=br.readLine())!=null){
            System.out.println("我客户端,服务器说"+info);
        }
        br.close();
        isr.close();
        pw.close();
        socket.close();



    }


}
