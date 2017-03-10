package cn.fyy.Test;

import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 *
 *                        死锁
 *                        过多同步会造成死锁
 * Created by FYY on 7/2/16.
 */
public class Syncdemo01 {
    public static void main(String[] args) {
        Object g = new Object();
        Object m = new Object();
        Test t1 = new Test(g,m);
        Test2 t2 = new Test2(g,m);
        Thread proxy = new Thread(t1);
        Thread proxy2 = new Thread(t2);
        proxy.start();
        proxy2.start();
//        if(proxy.isAlive()){
//            proxy2.start();
//        }

    }
}
class Test implements Runnable{
    Object goods;
    Object money;
    public Test(Object goods ,Object money) {
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
       while(true){
           test();
       }
    }
    public void test(){
        synchronized (goods){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            synchronized (money){
//
//            }
        }
        System.out.println("一手交钱");
    }

}
class Test2 implements Runnable{
    Object goods ;
    Object money ;

    public Test2(Object goods ,Object money) {
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
        while(true){
            test();
        }
    }
    public void test(){
        synchronized (money){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           // synchronized (goods){

           // }
        }
        System.out.println("一手交货");
    }

}
