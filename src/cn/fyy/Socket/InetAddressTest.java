package cn.fyy.Socket;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Created by FYY on 7/22/16.
 */
public class InetAddressTest {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();//获取本地信息
        System.out.println("主机名:"+address.getHostName());
        System.out.println("ip:"+address.getHostAddress());
         byte[] bytes = address.getAddress();//获取字节数组形式的ip
        System.out.println("字节数组形式的ip:"+ Arrays.toString(bytes));
        System.out.println(address);//直接输出主机名和ip
        System.out.println();

        //根据主机名获取inetaddress实例
       // InetAddress address2 = InetAddress.getByName("fuyaoyaodeMacBook-Pro.local");
        //根据ip获取inetaddress实例
        InetAddress address2 = InetAddress.getByName("192.168.1.102");
        System.out.println("主机名:"+address2.getHostName());
        System.out.println("ip:"+address2.getHostAddress());


    }


}
