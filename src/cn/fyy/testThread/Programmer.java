package cn.fyy.testThread;

/**
 * 使用runnavle创建线程
 * 1.实现runnable接口,重写run方法   真实角色
 * 2.启动多线程,静态代理
 * Created by FYY on 6/29/16.
 */
public class Programmer implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("1");
        }
    }
}
