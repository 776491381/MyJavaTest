package cn.fyy.Testcomp;

/**
 * Created by FYY on 7/10/16.
 */
public class pickup extends Cars {

    @Override
    public void run() {
        System.out.println("     pickup can run");
    }

    @Override
    public void people() {
        System.out.println("     pickup can take people");
    }

    @Override
    public void goods() {
        System.out.println("     pickup can take goods");
    }


    public pickup(String name, int price, int num) {
        super.name = name;
        this.price = price;
        this.num = num;
    }


}
