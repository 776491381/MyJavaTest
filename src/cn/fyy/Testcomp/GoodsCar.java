package cn.fyy.Testcomp;

/**
 * Created by FYY on 7/10/16.
 */
public class GoodsCar extends Cars {
    @Override
    public void run() {
        System.out.println("     can run");
    }

    @Override
    public void people() {
        System.out.println("     can't take people");
    }

    @Override
    public void goods() {
        System.out.println("     can take goods ");
    }

    public GoodsCar(String name , int price,int num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

}
