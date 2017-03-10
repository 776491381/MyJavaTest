package cn.fyy.IOStream;

import java.io.*;

/**
 * DataOutputstream
 * Created by FYY on 7/19/16.
 */
public class Dataoutindemo {
    public static void main(String[] args) throws IOException {
        String file = "demo/out3.txt";
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
        dos.writeInt(10);
      //  dos.writeChars("hello");
        dos.writeUTF("中国");
        dos.close();
        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        int i = dis.readInt();
        System.out.println(i);
        //char s = dis.readChar();
       // System.out.println(s);
        String s1 = dis.readUTF();
        System.out.println(s1);
        dis.close();

    }
}
