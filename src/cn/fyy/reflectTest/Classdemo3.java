package cn.fyy.reflectTest;

/**
 * Created by FYY on 7/31/16.
 */
public class Classdemo3 {

    public static void main(String[] args) {
        String s = "hello";
        classUtil cs = new classUtil();
        classUtil.PrintClassMessage(s);
        classUtil.PrintClassMessage(cs);
        //classUtil.PrintClassMessage();
    }
}
