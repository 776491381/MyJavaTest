package cn.fyy.testThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by FYY on 6/29/16.
 */
public class ticketApp implements Runnable {

    private int num = 500;
    private boolean flag =true;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while(flag){
            test();
            try {
                Thread.sleep(50); //50毫秒延时
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public  void test(){
            lock.lock();try {
            if (num <= 0) {
                flag = false;
                return;
            }

            System.out.println(Thread.currentThread().getName() + "抢到了" + num--);
        }finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        ticketApp app = new ticketApp();
        Thread t1 = new Thread(app,"first   ");
        Thread t2 = new Thread(app,"second   ");
        Thread t3 = new Thread(app,"thrid  ");
        t1.start();
        t2.start();
        t3.start();

    }
}
