package cn.fyy.notitionTest;

import com.sun.org.glassfish.gmbal.Description;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by FYY on 11/14/16.
 */
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("cn.fyy.notitionTest.child");
        boolean isE = c.isAnnotationPresent(Description.class);//找到类上的注释
        if(isE){
            //拿到注解实例
            Description d = (Description) c.getAnnotation(Description.class);
            System.out.println(d.value());
        }
        //解析找到方法上的注解
        Method[] ms = c.getMethods();
        System.out.println(ms.length);
        int flag = 0;
        for(Method m : ms){

            boolean isEw = m.isAnnotationPresent(Description.class);
            System.out.println("--["+m.getName()+"]");
            if (isEw) {
                System.out.println(flag++);
                Description d = (Description) m.getAnnotation(Description.class);
                System.out.println(d.value());
            }
        }


        //另一种解析方法
        for(Method m : ms){
            Annotation[] as = m.getAnnotations();
            for(Annotation a :as){
                if(a instanceof  Description){
                    System.out.println(((Description) a).value());
                }
            }
        }
    }
}
