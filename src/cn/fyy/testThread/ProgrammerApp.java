package cn.fyy.testThread;

/**
 * Created by FYY on 6/29/16.
 */
public class ProgrammerApp  {
    public static void main(String[] args) {
        //真实角色
        Programmer pro = new Programmer();
        Thread proxy = new Thread(pro);
        proxy.start();
        for(int i=0;i<100;i++){
            System.out.println("2");
        }
    }
}
