package cn.fyy.File;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * Created by FYY on 7/19/16.
 */
public class OpenFile {
    public static void main(String[] args) throws IOException {
        File demo = new File("demo");
        if(!demo.exists()){
            demo.mkdir();
        }

        File file = new File(demo,"rat.dat");
        if(!file.exists()){
            file.createNewFile();
        }

        RandomAccessFile rat = new RandomAccessFile(file,"rw");
        System.out.println(rat.getFilePointer());//指针的地方
        rat.write('A');
        rat.write('B');
        System.out.println(rat.getFilePointer());

        int i = 0x7fffffff;//write方法每次只能写入一个字节,要把i写进去就要写4次
        rat.write(i>>>24);//高8位
        rat.write(i>>>16);
        rat.write(i>>>8);
        rat.write(i);
        System.out.println(rat.getFilePointer());

        rat.writeInt(i);//通过writeint直接写int型啊
        System.out.println(rat.getFilePointer());

        String s = "中国";
        byte[] gbk = s.getBytes("gbk");
        rat.write(gbk);
        System.out.println(rat.getFilePointer());

        //读取文件,必须把指针放到头部
        rat.seek(0);
        byte[] buf = new byte[(int)rat.length()];
        rat.read(buf);
        System.out.println(Arrays.toString(buf));
        String s1 = new String(buf,"gbk");
        System.out.println(s1);

    }

}
