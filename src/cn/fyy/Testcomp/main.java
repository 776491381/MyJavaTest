package cn.fyy.Testcomp;

import java.security.PrivateKey;
import java.util.Scanner;

/**
 * Created by FYY on 7/10/16.
 */
public class main  {
    public static void main(String[] args) {
        Cars[] car = {new pickup("pickup",400,0),new GoodsCar("goodscar",300,1)};//使用多态
        System.out.println("do you want to rent a car? "+"\t"+"Y/N?");
        Scanner scan = new Scanner(System.in);
        String c = scan.next();
        System.out.println(c);
        if(c.equals("y")||c.equals("Y")){
            System.out.println("please choose a package");
           for(int i = 0;i<2;i++){
               car[i].info();
               car[i].run();
               car[i].people();
               car[i].goods();
               System.out.println();
           }
            System.out.println("choose one and input hao long will you rent");
            int e = scan.nextInt();
            int d = scan.nextInt();
            if(e<=1&&e>=0){}else{
                System.out.println("input error , set default");
                e=0;
            }
            System.out.println(("you choose the ")+car[e].name+"    you should pay "+car[e].price*d+"$");
            System.out.println("thank you , bye");

        }else{
            System.out.println("thank you , bye");

        }

    }


}
