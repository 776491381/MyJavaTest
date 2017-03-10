package cn.fyy.Test;

/**
 * Created by FYY on 7/2/16.
 */
public class MovieApp {
    public static void main(String[] args) {
        Movie m =new Movie();
        player p =new player(m);
        watcher w =new watcher(m);
        new Thread(p).start();
        new Thread(w).start();
    }
}
