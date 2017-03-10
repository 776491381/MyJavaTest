package cn.fyy.ThreadHigh;

/**
 * 舞台
 * Created by FYY on 7/24/16.
 */
public class Stage extends Thread {


    public static void main(String[] args) {
        new Stage().start();
    }

    public void run(){
        System.out.println("欢迎观看隋唐演义");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("大幕徐徐拉开");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("话说隋朝末年,隋军与农民起义杀的天昏地暗...");

        ArmyRunnable armytaskofsuiDynasty = new ArmyRunnable();
        ArmyRunnable armytaskofRevolt = new ArmyRunnable();


        Thread armyofsuiDynasty =new Thread(armytaskofsuiDynasty,"隋军队");
        Thread armyofsuiRevolt =new Thread(armytaskofRevolt,"农民起义军");

        armyofsuiDynasty.start();
        armyofsuiRevolt.start();


        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("正当双方激战是,杀出了一个程咬金");
        Thread MrChen = new KeyPersonThread();
        MrChen.setName("程咬金");
        System.out.println("程咬金的理想是结束战斗安居乐业");

//        armyofsuiDynasty.stop();
//        armyofsuiRevolt.stop();
        armytaskofsuiDynasty.keepRunnable=false;
        armytaskofRevolt.keepRunnable=false;//正确的线程退出

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MrChen.start();
        try {
            MrChen.join();//独占,其他线程必须等待这个线程执行完毕
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("战斗结束,谢谢");
//        try {
//            armyofsuiRevolt.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
