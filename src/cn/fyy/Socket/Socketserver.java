package cn.fyy.Socket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 *
 * 基于tcp
 * Created by FYY on 7/22/16.
 */
public class Socketserver {

    public static void main(String[] args) throws IOException {
        int count=0;
        ServerSocket ss = new ServerSocket(8888);
        Socket socket = null;
        System.out.println("等待连接");
        while(true) {
            socket = ss.accept();//监听并生成一个socket
            //获取输入流读取信息
            count++;
            System.out.println("客户端数量:"+count);
            InetAddress address = socket.getInetAddress();
            System.out.println("当前客户端ip:"+address.getHostAddress());
            ServerThread serverThread = new ServerThread(socket);
            serverThread.start();
        }

    }


}
