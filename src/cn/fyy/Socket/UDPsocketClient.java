package cn.fyy.Socket;

import java.io.IOException;
import java.net.*;

/**
 * 定义发送信息
 * 创建DatagramPacket,包含发送的信息
 * 创建DatagramSocket
 * 发送数据
 * Created by FYY on 7/24/16.
 */
public class UDPsocketClient {


    public static void main(String[] args) throws IOException {
        //定义服务器地址,端口号,相应的数据
        InetAddress address = InetAddress.getByName("localhost");
        int port = 8888;
        byte[] data = "用户名:admin,密码:123".getBytes();
        DatagramPacket packet = new DatagramPacket(data,data.length,address,port);//打包数据,带有目标地址
        DatagramSocket socket = new DatagramSocket();
        socket.send(packet);//发送数据


        //接受响应信息

        byte[] data2 = new byte[1024];
        DatagramPacket packet2 = new DatagramPacket(data2,data2.length);
        socket.receive(packet2);
        String reply = new String(data2,0,packet2.getLength());
        System.out.println("我是客户端,服务器说:  "+reply);
        socket.close();

    }


}
