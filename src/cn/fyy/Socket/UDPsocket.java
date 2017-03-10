package cn.fyy.Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**基于UDP
 * 创建DAtagramSocket指定端口号
 * 创建DatagramPacket
 * 接受客户端发送信息
 * 读取数据
 * Created by FYY on 7/24/16.
 */
public class UDPsocket {



    public static void main(String[] args) throws IOException {


        DatagramSocket socket = new DatagramSocket(8888);

        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data,data.length);
        System.out.println("等待数据");
        socket.receive(packet);//会处于阻塞状态,类似accept
        String info = new String(data,0,packet.getLength());//将字节流转换位string
        System.out.println("我是服务器,客户端说:  "+info);

        //相应客户端
        //需要知道客户端地址端口号
        InetAddress address = packet.getAddress();
        int port = packet.getPort();//通过客户端数据获取
        byte[] data2 = "欢迎".getBytes();
        DatagramPacket packet2 = new DatagramPacket(data2,data2.length,address,port);
        socket.send(packet2);
        socket.close();

    }






}
