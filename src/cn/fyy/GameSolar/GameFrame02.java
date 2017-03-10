package cn.fyy.GameSolar;

import java.awt.*;

/**
 * Created by FYY on 7/3/16.
 */

public class GameFrame02 extends MyFrame {

        Image img = GameUtil.getImage("cn/fyy/images/sun.png");//加载图片

        private  double  x=Math.random()*100,y=Math.random()*100;
        private boolean flag = false;
        private double degree=3.14/3;//[0,2pi]
        private double speed=10;
        private double a = 0.05;
        @Override
        public void paint(Graphics g) {


//            g.drawImage(img,(int)x,(int)y,null);//画图片
//            if(flag){
//                x+=3;y+=3;
//            }else{
//                x-=3;y-=3;
//            }
//            if((x>415&&y>415)||(x<0&&y<0)){
//                flag=!flag;
//            }

            g.fillOval((int)x,(int)y,20,20);

            x+=speed*Math.cos(degree);
            y+=speed*Math.sin(degree);
            if(y>480||y<25){
                degree=-degree;
            }
            if(x>480||x<0){
                degree = Math.PI-degree;
            }
            if(speed>0){
                speed-=a;
            }
            else speed=0;
            //degree+=0.1;
        }


        public static void main(String[] args) {
        GameFrame02 gf = new GameFrame02();
            gf.launchFrame();
        }


    }
