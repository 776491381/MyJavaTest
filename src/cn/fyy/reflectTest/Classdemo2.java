package cn.fyy.reflectTest;

/**
 * Created by FYY on 7/31/16.
 */
public class Classdemo2 {

    public static void main(String[] args) {
        Class c1 = int.class;//int的类类型,可理解为int的字节码
        Class c2 = String.class;//String类的类类型
        System.out.println(c1.getName()+"   "+c2.getName());
    }

}

