package cn.fyy.ThreadHigh;

/**
 * Created by FYY on 7/24/16.
 */
public class KeyPersonThread extends Thread {

    public void run(){
        System.out.println(Thread.currentThread().getName()+"开始了战斗");

        for(int i = 0;i<10 ;i++){
            System.out.println(Thread.currentThread().getName()+"左突右杀,攻击随军");
        }

        System.out.println(Thread.currentThread().getName()+"结束了战斗");



    }

}
