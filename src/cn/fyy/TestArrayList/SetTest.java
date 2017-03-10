package cn.fyy.TestArrayList;

import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.*;

/**
 * Created by FYY on 7/16/16.
 */
public class SetTest {

    public List<Course> cts;
    private Scanner scan;
    public Stu stu;
    public SetTest() {
        cts = new ArrayList<Course>();
        scan = new Scanner(System.in);
    }
    public void TestAdd(){
        Course cr1 = new Course("1","数据结构");
        cts.add(cr1);
        Course temp = (Course)cts.get(0);
       // System.out.println("课程:"+temp.name+"  添加成功"+"  位置:"+temp.id);


        Course cr2 = new Course("2","C语言");
        cts.add(1,cr2);
        Course temp2 = (Course) cts.get(1);
        //System.out.println("课程:"+temp2.name+"  添加成功"+"  位置:"+temp2.id);

        Course[] course = {new Course("3","离散数学"), new Course("4","汇编语言")};
        cts.addAll(Arrays.asList(course));
        Course temp3 = (Course) cts.get(2);
        Course temp4 = (Course) cts.get(3);
       // System.out.println("课程:"+temp3.name+"  添加成功"+"  位置:"+temp3.id);
       // System.out.println("课程:"+temp4.name+"  添加成功"+"  位置:"+temp4.id);

        Course[] course2 = {new Course("5","大学英语"), new Course("6","高等数学")};
        cts.addAll(4,Arrays.asList(course2));
        Course temp5 = (Course) cts.get(4);
        Course temp6 = (Course) cts.get(5);
       // System.out.println("课程:"+temp5.name+"  添加成功"+"  位置:"+temp5.id);
       // System.out.println("课程:"+temp6.name+"  添加成功"+"  位置:"+temp6.id);
    }

    public void foreach(){
        for(Course cr : cts){
            System.out.println(cr.id+"   "+cr.name);
        }
    }


    /**
     * 测试List中的contains方法
     * @param
     */
    public void testListContains(){
        Course course = new Course("7","tset");
        cts.add(course);
        System.out.println("get   "+course.name);
        System.out.println("课程中是否包含课程:"+course.name+","+cts.contains(course));
        System.out.println("请输入查询课程代码名字");
        String name = scan.next();
        Course course2 = new Course();
        course2.name=name;
        System.out.println("课程中是否包含课程:"+course2.name+","+cts.contains(course2));//通过在Course中重写equel方法实现内容一样判断为真
        if (cts.contains(course2)) {

            System.out.println("课程: "+course2.name+"索引位置"+cts.indexOf(course2));
        }



    }

    /**
     * 创建对象并选课
     * @param
     */
    public void createStudentAndSeletCourse(){

        stu = new Stu("1","小明");
        System.out.println("欢迎"+stu.name+"选课");
        Scanner scan = new Scanner(System.in);
        for(int i =0;i<3;i++){
            System.out.println("请输入课程id");
            String cid = scan.next();
            for(Course cr:cts){
                if(cr.id.equals(cid)){
                    stu.courses.add(cr);
                }
            }
        }
        TestForeachSet(stu);
    }

    /**
     * 测试Set的contain方法
     * @param
     */
    public void testSetContian(){
        //提示输入课程名称
        System.out.println("输入课程名称");
        String name = scan.next();
        Course course2 = new Course();
        course2.name=name;
        System.out.println("课程中是否包含课程:"+course2.name+","+stu.courses.contains(course2));

    }

    public void TestForeachSet(Stu stu){
        System.out.println("一共选择了"+stu.courses.size()+"门课程");
        for(Course cr : stu.courses){//由于hashset中元素是无序的,所以要进行遍历,每次结果可能不一样
            System.out.println("选择的课程"+cr.id+":   "+cr.name);
        }
    }




    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.TestAdd();
        st.foreach();
        st.createStudentAndSeletCourse();
        st.testListContains();
        st.testSetContian();
        st.foreach();
    }

}
