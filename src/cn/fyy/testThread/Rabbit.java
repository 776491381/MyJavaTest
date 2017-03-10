package cn.fyy.testThread;

/**
 * Created by FYY on 6/29/16.
 */

public class Rabbit extends Thread{

    @Override
    public void run() {
        for(int i=0;i<100;i=i+2){
            System.out.println("rabbit has run "+i+"steps");
        }
    }//重写run方法
}
class Tortoise extends Thread{

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("tortoise has run "+i+"steps");
        }
    }
}
