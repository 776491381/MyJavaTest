package cn.fyyStruct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by FYY on 11/30/16.
 */
public class struct1 {

    public static void main(String[] args) throws IOException {
        struct1 st = new struct1();
        System.out.println(st.getString());
        System.out.println(st.testString());
    }

    public char testString() throws IOException {
        String s = getString();
        return  s.charAt(0);
    }

    public String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
