package cn.fyy.notitionTest;

import com.sun.org.glassfish.gmbal.Description;

import java.lang.annotation.Annotation;

/**
 * Created by FYY on 11/10/16.
 */



@Description("i am a class ann")
public class child implements Person {
    @Override  //表示方法覆盖父类方法
    @Description("i am a method ann")
    public String name() {
        return null;
    }

    @Override

    @Description("i am a method ann2")
    public int age() {
        return 0;
    }

    @Override
    public void sing() {

    }
}

class child2de implements De{


    int age = 9;
    @Override
    public String sex() {
        return null;
    }

    @Override
    public int age() {
        return 0;
    }


    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}