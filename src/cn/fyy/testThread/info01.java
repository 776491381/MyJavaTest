package cn.fyy.testThread;

import javax.xml.stream.events.StartDocument;

/**
 * Created by FYY on 6/29/16.
 */
public class info01 {
    public static void main(String[] args) throws InterruptedException {
        ThreadInfo t1 = new ThreadInfo();
        Thread proxy = new Thread(t1,"name");
        System.out.println(proxy.getName());
        proxy.setName("name2");
        System.out.println(proxy.getName());
        proxy.start();
        Thread.sleep(200);
        t1.stop();
    }
}
