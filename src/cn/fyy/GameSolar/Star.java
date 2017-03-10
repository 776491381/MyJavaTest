package cn.fyy.GameSolar;

import java.awt.*;

/**
 * Created by FYY on 7/3/16.
 */
public class Star extends MyFrame {
    Image img;
      double x,y,i,j;
    @Override
    public void paint(Graphics g) {
        g.drawImage(img,(int)x,(int)y,(int)i,(int)j,null);
    }
    public Star(String img ,double x , double y,double i,double j){
        this.img = GameUtil.getImage(img);
        this.x = x;
        this.y =y;
        this.i=i;
        this.j=j;
    }
    public Star(){

    }
}
