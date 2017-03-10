package cn.fyy.Test;

/**
 * Created by FYY on 7/2/16.
 */
public class Movie {


    private String pic;
    private boolean flag=true;//信号灯,t为生产,消费者等待,生产完成通知消费


    public synchronized void play (String pic ){
        if(!flag){//生产者等待,等消费者消费完成
            try {
                this.wait();
            } catch (InterruptedException e) {

            }
        }
        //开始生产
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("生产了"+pic);
        this.pic=pic;
        //生产完毕
        //通知消费
        this.notify();
        //生产停止
        this.flag=false;
    }


    public synchronized void watch(){
        if(flag){ //消费者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
                //开始消费
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("消费了"+pic);
        //消费完毕
        //通知生产
        this.notifyAll();//通知所有
        //消费停止
        this.flag=true;


    }
}
