package cn.fyy.reflectTest;

import java.lang.reflect.Method;

/**
 *
 * 获取类的信息
 * Created by FYY on 7/31/16.
 */
public class classUtil {
        public static void PrintClassMessage(Object obj){
            //获取类的信息要先获取类类型
            Class c = obj.getClass();//获取obj的类类型
            System.out.println("类的名称  "+c.getName());
            Method[] ms = c.getMethods();//获取所有public函数包括父类继承
            //c.getdeclaremethods()获取所有该类自己声明的方法,不问访问权限
            for(int i = 0;i<ms.length;i++){
                System.out.print("方法名称 "+ms[i].getName()+"(");
                Class returnTypr = ms[i].getReturnType();//获取方法返回值类型的类类型
                System.out.print("返回值类型 "+returnTypr.getName()+"参数类型 ");
                Class[] paramTypes = ms[i].getParameterTypes();//获取参数类型的类类型
                for(Class class1 : paramTypes){
                    System.out.print(class1.getName()+",");
                }
                System.out.println(")");
            }

            }

}
