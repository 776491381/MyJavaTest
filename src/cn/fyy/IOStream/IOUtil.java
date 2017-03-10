package cn.fyy.IOStream;

import java.io.*;

/**
 *
 * 读取指定文件内容,16进制输出
 * 每输出10byte换行
 * Created by FYY on 7/19/16.
 */
public class IOUtil {


    public static void printHex(String fileName) throws IOException {
        FileInputStream in = new FileInputStream(fileName);
        int b;
        int i=1;
        while((b=in.read())!=-1){
            if(b<=0xf){
                System.out.print("0");
            }
            System.out.print(Integer.toHexString(b)+" ");
            if(i++%10==0){
                System.out.println();
            }
        }
        in.close();
    }
    public static void printHexbytearray(String filename) throws IOException {
        int j = 1;
        FileInputStream in = new FileInputStream(filename);
        byte[] buf = new byte[20*1024];
//        int bytes = in.read(buf);//一次性读取完整的情况
//        System.out.println(bytes);
//        for(int i = 0; i<bytes;i++){
//            if(buf[i]<=0xf){
//                System.out.print("0");
//            }
//            System.out.print(Integer.toHexString(buf[i])+" ");
//            if(j++%10==0){
//                System.out.println();
//            }
//
//        }
        int bytes = 0;
        while((bytes=in.read(buf))!=-1){//一次性可能读不完,buf可能被多次使用,比如读40字节,buf容量20,就要读两次,bytes两次都为20
            for(int i = 0;i<bytes;i++){
                if(buf[i]<=0xf){
                System.out.print("0");
            }
            System.out.print(Integer.toHexString(buf[i])+" ");
            if(j++%10==0){
                System.out.println();
            }
            }
        }
    }


    public static void copyfile(File srcfile,File destfile) throws IOException {
        if(srcfile.exists()==false){
            throw new IllegalArgumentException("file doesn't exists");
        }
     if(!srcfile.isFile()){
         throw new IllegalArgumentException("not file");
     }

        FileInputStream in =new FileInputStream(srcfile);
        FileOutputStream out = new FileOutputStream(destfile);
        byte[] buf = new byte[8*1024];
        int b;
        while((b=in.read(buf))!=-1){
            out.write(buf,0,b);//这里的b是字节数
            out.flush();
        }
        in.close();
        out.close();
    }


    public static void copyFileBuffered(File srcfile,File destfile)throws IOException{
        //带缓冲的字节流拷贝
        if(srcfile.exists()==false){
            throw new IllegalArgumentException("file doesn't exists");
        }
        if(!srcfile.isFile()){
            throw new IllegalArgumentException("not file");
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcfile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destfile));
        int c;
        while((c=bis.read())!=-1){
            bos.write(c);//这里的c是数据
            bos.flush();//刷新缓冲区
        }

        bis.close();
        bos.close();
    }

}
