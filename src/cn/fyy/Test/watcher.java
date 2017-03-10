package cn.fyy.Test;

/**
 * Created by FYY on 7/2/16.
 */
public class watcher implements Runnable {
    private Movie m;

    public watcher(Movie m) {
        this.m = m;
    }

    @Override
    public void run() {
        for(int i=0;i<20;i++){
            m.watch();
        }
    }
}
