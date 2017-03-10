package cn.fyy.Testcomp;

/**
 * Created by FYY on 7/10/16.
 */
public abstract class Cars  {
    public int num;
    public int price;
    public String name;
    public  abstract  void run();
    public abstract void people();
    public abstract void goods();
    public void info(){
        System.out.println(num+"    "+name+"    "+price+"$  everyday");
    }
}
