package cn.fyy.TestArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 测试泛型
 *
 *
 * 泛型类型不能是基本类型
 * Created by FYY on 7/16/16.
 */
public class TestGeneric {
    public List<Course> courses;//带有泛型Course的List,名字位courses

    public TestGeneric() {
        this.courses = new ArrayList<Course>();
    }

    public void TestAdd(){
        Course cr1 = new Course("1","Chinese");
        courses.add(cr1);
        //courses.add("fffffff");由于规定了泛型位Course,所以必须为Course类型
        //System.out.println(courses.get(0).name);
        Course cr2 = new Course("2","english");
        courses.add(cr2);
    }
    public void foreach(){
        for(Course cr : courses){
            System.out.println(cr.id+"   "+cr.name);
        }
    }

    /**
     * 泛型的子类型
     */
    public void testChild(){
        ChildCourse ccr = new ChildCourse();
        ccr.id ="3";
        ccr.name="child test";

        courses.add(ccr);
    }

    public static void main(String[] args) {
        TestGeneric tg = new TestGeneric();
        tg.TestAdd();
        tg.foreach();
        tg.testChild();
        tg.foreach();
    }
}
