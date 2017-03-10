package cn.fyy.testThread;

/**优先级默认是5最大10最小1
 * Created by FYY on 6/29/16.
 */
public class info02 {


    public static void main(String[] args) throws InterruptedException {
        ThreadInfo it = new ThreadInfo();
        Thread p1 = new Thread(it,"it1");
        ThreadInfo it2 = new ThreadInfo();
        Thread p2 = new Thread(it2,"it2");

        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);
        p1.start();
        p2.start();

        Thread.sleep(100);
        it.stop();
        it2.stop();

    }


}
