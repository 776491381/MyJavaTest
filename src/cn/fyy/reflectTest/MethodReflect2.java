package cn.fyy.reflectTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * 通过反射认识泛型的本质
 * Created by FYY on 11/10/16.
 */
public class MethodReflect2 {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList list = new ArrayList();
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("hello");
        Class c1 = list.getClass();
        Class c2 = list1.getClass();
        System.out.println(c1==c2);//反射的操作都是编译之后的操作,就是运行时操作
        //结果返回TRUE 说明java中集合的泛型是防止错误输入,只在编译时有效,编译后无效
        //通过方法的反射绕过编译验证
        Method m = c2.getMethod("add",Object.class);
        m.invoke(list1,1);
        System.out.println(list1.size());
        System.out.println(list1); //通过反射绕过泛型,不能用foreach遍历,编译会通不过

    }
}
