package cn.fyy.reflectTest;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by FYY on 7/31/16.
 */
public class OfficeBetter {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        while (true) {
            Scanner sc = new Scanner(System.in);
            String arg = "cn.fyy.reflectTest.";
            arg += JOptionPane.showInputDialog(null,"输入类全路径");
            //arg += sc.next();
            Class c = Class.forName(arg);//动态加载类,运行时加载,编译不会报错
            //通过类类型创建对象
            Officeable oa = (Officeable) c.newInstance();
            oa.start();
        }
    }

}
