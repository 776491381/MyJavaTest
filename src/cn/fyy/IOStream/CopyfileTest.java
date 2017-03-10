package cn.fyy.IOStream;

import java.io.File;
import java.io.IOException;

/**
 * Created by FYY on 7/19/16.
 */
public class CopyfileTest {
    public static void main(String[] args) throws IOException {
       // IOUtil.copyfile(new File("demo/out.dat"),new File("demo/outcp.dat"));
        IOUtil.copyFileBuffered(new File("demo/out.dat"),new File("demo/outcp.dat"));
    }
}
