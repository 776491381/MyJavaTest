package cn.fyy.Test;

/**生产者
 * Created by FYY on 7/2/16.
 */
public class player implements Runnable{

    private Movie m;

    public player(Movie m) {
        this.m = m;
    }

    @Override
    public void run() {
        for(int i=0;i<20;i++){
            if(0==i%2){
                m.play("qinglong");
            }else{
                m.play("baihu");
            }
        }
    }
}
