package cn.fyy.IOStream;

import java.io.IOException;

/**
 * IO流（输入和输出流）
 * 字节流,字符流
 * 字节流:inputStream,OutputStream
 * 输入流基本方法:int b = in.read();读取一个字节填充到int低八位
 *              in.read(byte[] buf);读取数据填充到字节数组
 * 输出流基本方法:out.write(int b)写出一个byte到流,b的低八位
 *              out.write(byte[] buf)将buf字节数组都写到流中
 *
 * FileinputStream.FileoutputStream
 * Dataoutputstream,Datainputstream,方便读取int long类型数据writeint/writedouble/writeUTF
 * Created by FYY on 7/19/16.
 */
public class IOstreamTest {
    public static void main(String[] args) throws IOException {
        IOUtil.printHex("/Users/FYY/Desktop/IdeaProjects/File/test.txt");
        System.out.println();
        IOUtil.printHexbytearray("/Users/FYY/Desktop/IdeaProjects/File/test.txt");
    }
}

