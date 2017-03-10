package cn.fyy.reflectTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by FYY on 11/10/16.
 */
public class Methodeflect {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //获取print方法
        A a1 = new A();
        Class c = a1.getClass();
        Method m = c.getDeclaredMethod("print",new Class[]{int.class,int.class});//可变参数
        Method m2 = c.getDeclaredMethod("print",new Class[]{String.class,String.class});//可变参数
       //== Method m2 = c.getDeclaredMethod("print",String.class,String.class);
        Method m3 = c.getDeclaredMethod("print",new Class[]{});
        //方法的反射操作
        a1.print(10,20);
        m.invoke(a1,new Object[]{10,20});
        m2.invoke(a1,new Object[]{"qqq","www"});
        m3.invoke(a1,new Object[]{});
    }
}


class A{

    public void print(){
        System.out.println("hello world");
    }

    public void print(int a,int b){
        System.out.println(a+b);
    }

    public void print(String a , String b){
        System.out.println(a.toUpperCase()+","+b.toUpperCase());
    }


}