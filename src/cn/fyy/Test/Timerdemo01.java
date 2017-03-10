package cn.fyy.Test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * 任务调度
 * QUARTZ框架可实现,专业
 * Created by FYY on 7/2/16.
 */
public class Timerdemo01 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("so easy");
            }
        },new Date(System.currentTimeMillis()+1000),200);
    }
}
