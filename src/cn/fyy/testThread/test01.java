package cn.fyy.testThread;

/**
 * Created by FYY on 16/6/15.
 */
public class test01 {
    public static void main(String[] args) {
        Thread curr;
        int num = 7;
        curr = Thread.currentThread();
        curr.setPriority(num);
        System.out.println("current thread:"+curr);
        System.out.println("thread name:"+curr.getName());
        System.out.println("Priority:"+curr.getPriority());
    }
}
