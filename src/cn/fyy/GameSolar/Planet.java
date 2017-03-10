package cn.fyy.GameSolar;

import java.awt.*;

/**
 * Created by FYY on 7/3/16.
 */
public class Planet extends Star {

    double longaxis;//椭圆的长短轴
    double shortaxis;
    double speed;
    double degree;
    Star center;

    public Planet(String img,double speed, double shortaxis, double longaxis, Star center,double i,double j) {
        this.center = center;
        super.x = center.x+longaxis;
        super.y=center.y;
        super.img = GameUtil.getImage(img);
        this.speed = speed;
        this.shortaxis = shortaxis;
        this.longaxis = longaxis;
        super.i=i;
        super.j=j;
    }

    public void paint(Graphics g,int a,int b ,int flag) {
        g.drawImage(img,(int)x,(int)y,(int)i,(int)j,null);
        x=center.x+longaxis*Math.cos(degree)+a;
        y=center.y+shortaxis*Math.sin(degree)+b;
        if(flag==0)
        degree+=speed;
        if(flag==1)
            degree+=2*speed;
    }

}
