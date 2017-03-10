package cn.fyy.File;

import java.io.File;

/**
 * Created by FYY on 7/19/16.
 */
public class Filedemo {

    public static void main(String[] args) {
        File file = new File("/Users/FYY/Desktop/IdeaProjects/File/test.txt");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file);
        System.out.println(file.getAbsolutePath());
    }
}
