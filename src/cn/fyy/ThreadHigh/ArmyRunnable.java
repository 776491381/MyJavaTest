package cn.fyy.ThreadHigh;

/**
 * Created by FYY on 7/24/16.
 */
public class ArmyRunnable implements Runnable {

    //volatile保证线程可以正确接受其他线程的值,类似指针
   volatile boolean keepRunnable=true;
    @Override
    public void run() {

        while(keepRunnable){
            //发动5连击
            for(int i = 0; i<5; i++){
                System.out.println(Thread.currentThread().getName()+"进攻对方["+i+"]");
                Thread.yield();//让出处理器时间
            }
        }
        System.out.println(Thread.currentThread().getName()+"结束战斗");



    }
}
