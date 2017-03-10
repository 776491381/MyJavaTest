package cn.fyy.notitionTest;

/**
 * Created by FYY on 11/10/16.
 */
public class Test {
    public void sing(){
        Person p = new child();
        //noinspection deprecation
        p.sing();  //通过注解实现
         Person p2 = (Person) new child2de();
        System.out.println(p2.age());
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.sing();
    }
}
