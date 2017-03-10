package cn.fyy.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by FYY on 7/19/16.
 */
public class Filereaderwritertest {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo/out3.txt");
        FileWriter fw = new FileWriter("demo/out3filewriter.txt",true/*追加内容*/);
        char[] buffer = new char[2056];
        int c;
        while((c=fr.read(buffer,0,buffer.length))!=-1){

            fw.write(buffer,0,c);
            fw.flush();

        }
        fr.close();
        fw.close();
    }
}

