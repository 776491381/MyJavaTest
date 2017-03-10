package cn.fyy.GameSolar;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by FYY on 7/3/16.
 */
public class MyFrame extends Frame {
    public  void launchFrame(){
        setSize(Constant.x,Constant.y);
        setLocation(300,300);
        setVisible(true);

        new PaintThread().start();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    class PaintThread extends Thread{
        public void run(){
            while(true){
                repaint();//重画窗口
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
