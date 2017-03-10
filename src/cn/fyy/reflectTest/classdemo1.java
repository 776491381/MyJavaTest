package cn.fyy.reflectTest;

/**
 *
 * new对象是静态加载,编译时都加载
 * 通过动态加载可解决
 * Created by FYY on 7/31/16.
 */
public class classdemo1 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Foo foo1 = new Foo();//Foo的实例对象
        //任何一个类都是Class的实例对象
        //第一种表达方式
        Class c1 = Foo.class;
        //第二种表达方式
        Class c2 = foo1.getClass();
        //c1 c2鸟事了Foo类的类类型,一个类只可能是Class类的一个实例对象

        //第三种表达方式
        Class c3 = null;
        c3 = Class.forName("cn.fyy.reflect.Foo");//动态加载


        System.out.println(c1+"         "+c2+"          "+c3);
        //可以通过类类型创建对象实例
        Foo foo = (Foo) c1.newInstance();
    }


}

class  Foo{




}
