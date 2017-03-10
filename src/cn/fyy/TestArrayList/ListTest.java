package cn.fyy.TestArrayList;

import sun.plugin.dom.core.CoreConstants;

import java.util.*;

/**
 * Created by FYY on 7/16/16.
 */
public class ListTest {

    public List cts;//为接口,要用实现类实现,就是arraylist,容器中元素可以重复添加

    public ListTest(){
        this.cts = new ArrayList<>();
    }

    /**
     * 用于添加课程
     */
    public void TestAdd(){
        Course cr1 = new Course("1","数据结构");
        cts.add(cr1);
        Course temp = (Course)cts.get(0);
        System.out.println("课程:"+temp.name+"  添加成功"+"  位置:"+temp.id);


        Course cr2 = new Course("2","C语言");
        cts.add(1,cr2);
        Course temp2 = (Course) cts.get(1);
        System.out.println("课程:"+temp2.name+"  添加成功"+"  位置:"+temp2.id);

        Course[] course = {new Course("3","离散数学"), new Course("4","汇编语言")};
        cts.addAll(Arrays.asList(course));
        Course temp3 = (Course) cts.get(2);
        Course temp4 = (Course) cts.get(3);
        System.out.println("课程:"+temp3.name+"  添加成功"+"  位置:"+temp3.id);
        System.out.println("课程:"+temp4.name+"  添加成功"+"  位置:"+temp4.id);

        Course[] course2 = {new Course("5","大学英语"), new Course("6","高等数学")};
        cts.addAll(4,Arrays.asList(course2));
        Course temp5 = (Course) cts.get(4);
        Course temp6 = (Course) cts.get(5);
        System.out.println("课程:"+temp5.name+"  添加成功"+"  位置:"+temp5.id);
        System.out.println("课程:"+temp6.name+"  添加成功"+"  位置:"+temp6.id);
    }

    public void TestGet(){
        int size = cts.size();
        System.out.println();
        System.out.println("        添加了如下课程");
        for(int i = 0; i<size;i++){
            Course cr = (Course) cts.get(i);
            System.out.println("课程:"+cr.name+"  位置:"+cr.id);
        }
    }
    public void TestIterator(){//为接口,迭代器遍历
        Iterator it = cts.iterator();
        System.out.println("        迭代器访问,如下课程");
        while(it.hasNext()){
            Course cr = (Course) it.next();
            System.out.println("课程:"+cr.name+"  位置:"+cr.id);
        }
    }
    public void Foreach(){
        System.out.println("        foreach 遍历");
        for(Object obj:cts){
            Course cr = (Course)obj;
            System.out.println("课程:"+cr.name+"  位置:"+cr.id);
        }
    }

    /**
     * 修改元素
     * @param
     */

    public void TestModify(){
        cts.set(0,new Course("7","毛概"));

    }

    /**
     * 删除元素
     * @param
     */
    public void Testremove(){
        Course cr = (Course) cts.get(0);
        System.out.println("        "+cr.id+"  "+cr.name+"将被删除");
        cts.remove(cr);
        System.out.println("        成功删除");
        Foreach();
    }
    public void Testremove2(){
        System.out.println("        即将删除2位置上的课程");
        cts.remove(0);
        System.out.println("        删除成功");
        Foreach();
        Course[] cr = {(Course) cts.get(0), (Course) cts.get(1)};
        System.out.println("        即将删除3和4位置上的课程");
        cts.removeAll(Arrays.asList(cr));
        System.out.println("        删除成功");
        Foreach();

    }

    public void TestType(){
        System.out.println("测试能否往list中添加奇怪的东西");
        cts.add("我是字符串");
    }

    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.TestAdd();
        lt.TestGet();
        lt.TestIterator();
        lt.Foreach();
        lt.TestModify();
        lt.Foreach();
        lt.Testremove();
        lt.Testremove2();
    }

}


