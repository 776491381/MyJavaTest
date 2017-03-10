package cn.fyy.File;

import java.io.File;
import java.io.IOException;

/**
 * Created by FYY on 7/19/16.
 */
public class FileUtilTest {

    public static void main(String[] args) throws IOException {
        FileUtils.listDirectory(new File("/Users/FYY/Desktop/IdeaProjects/File/"));
    }
}
