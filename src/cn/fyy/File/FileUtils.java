package cn.fyy.File;

import java.io.File;
import java.io.IOException;

/**
 * Created by FYY on 7/19/16.
 */
public class FileUtils {

    public static void listDirectory(File dir)throws IOException{
        if(!dir.exists()){
            throw new IllegalArgumentException("不存在");
        }
        if(!dir.isDirectory()){
            throw new IllegalArgumentException(dir+"不是目录");
        }
        String[] filename = dir.list();//当前目录下的文件和目录,不包含子目录下的文件和目录
        for(String a:filename){
            System.out.println(a);
        }
        System.out.println();
        File[] files = dir.listFiles();
        if(files!=null&&files.length>0){
            for(File file : files){
                if(file.isDirectory()){
                    //递归
                    listDirectory(file);
                }else{
                    System.out.println(file);
                }
            }
        }
    }

}
