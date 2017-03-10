package cn.fyy.array;

/**
 * Created by FYY on 16/6/11.
 */
public class test01 {
    public static void main(String[] args){
        int [] a = new int [3];
        a[0]=23;
        a[1]=24;
        a[2]=25;
       // System.out.println(a[1]);
        double []b = new double[2];
        car []c = new car[10];
        c[0]=new car("benz");
        c[1]=new car("byd");
        System.out.println(c[0].name);

        System.out.println(a.length);
        System.out.println(c.length);



    }

}
