package cn.fyy.GameSolar;

import java.awt.*;

/**
 * Created by FYY on 7/3/16.
 */
public class SolarFrame extends MyFrame {
    Image bg = GameUtil.getImage("cn/fyy/images/bg.png");



    Star sun = new Star("cn/fyy/images/sun.png",370,270,50,50);
    Planet shui = new Planet("cn/fyy/images/shui.png",0.2,40,50,sun,10,10);
    Planet jin = new Planet("cn/fyy/images/jin.png",0.17,70,80,sun,18,18);
    Planet earth = new Planet("cn/fyy/images/di.png",0.14 ,100,150,sun,20,20);
    Planet huo = new Planet("cn/fyy/images/huo.png",0.12,120,180,sun,14,14);
    Planet mu = new Planet("cn/fyy/images/mu.png",0.09,150,220,sun,30,30);
    Planet tu = new Planet("cn/fyy/images/tu.png",0.08,190,270,sun,25,25);
    Planet tian = new Planet("cn/fyy/images/tian.png",0.03,240,330,sun,22,22);
    Planet hai = new Planet("cn/fyy/images/hai.png",0.02,270,360,sun,24,24);
    Planet moon = new Planet("cn/fyy/images/moon.png",0.1,20,20,earth,5,5);
    @Override
    public void paint(Graphics g) {
        g.drawImage(bg,0,23,null);
        g.setColor(Color.blue);
        g.drawOval(345,255,100,80);
        g.drawOval(315,225,160,140);
        g.drawOval(245,195,300,200);
        g.drawOval(215,175,360,240);
        g.drawOval(175,145,440,300);
        g.drawOval(125,105,540,380);
        g.drawOval(65,55,660,480);
        g.drawOval(35,25,720,540);
        sun.paint(g);
        earth.paint(g,20,20,0);
        shui.paint(g,20,20,0);
        jin.paint(g,20,20,0);
        huo.paint(g,20,20,0);
        mu.paint(g,20,20,0);
        tu.paint(g,20,20,0);
        tian.paint(g,20,20,0);
        hai.paint(g,20,20,0);
        moon.paint(g,8,8,1);
    }

    public static void main(String[] args) {
        new SolarFrame().launchFrame();
    }
}
