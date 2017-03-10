package cn.fyy.notitionTest;

/**
 * Created by FYY on 11/10/16.
 */

@De(age=18,sex = "man")//自定义注解


public interface Person {

    public String name();

    public int age();
    @Deprecated//表示方法过时了
    public void sing();



}

@interface  De{


    String sex();

    int age() default 18;
}
