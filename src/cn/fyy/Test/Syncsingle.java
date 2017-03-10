package cn.fyy.Test;

/**
 *
 *                                单例模式
 * Created by FYY on 7/2/16.
 */
public class Syncsingle {
    public static void main(String[] args) {
        myThread my = new myThread(100);
        myThread my2 = new myThread(500);
        my.start();
        my2.start();

    }
}
class myThread extends Thread{
    private long time;

    public myThread(long time) {
        this.time = time;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+Jvm.getinst(time));
    }

}
//懒汉式,用的时候new对象
class Jvm{
    private static Jvm inst = null;
    private Jvm(){

    }
    public static Jvm getinst(long time){
    //双重检查
        if(null==inst) {
            synchronized (Jvm.class) {//锁定静态信息
                if (null == inst) {
                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    inst = new Jvm();
                }
            }
        }
        return inst;
    }

}

//饿汉试,直接new对象
class Jvm2{
    private static  class JVMholder{
                         private static Jvm2 inst2 = new Jvm2();}//内部类,在使用时加载提高效率
    private Jvm2(){

    }
    public static Jvm2 getinst(){

                    JVMholder.inst2 = new Jvm2();

        return JVMholder.inst2;
    }

}