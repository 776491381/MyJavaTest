package cn.fyy.TestArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by FYY on 7/18/16.
 */
public class MapTest {

    public Map<String ,Stu>student;
    private Scanner scan;
    public MapTest() {
        scan=new Scanner(System.in);
        this.student = new HashMap<String , Stu>();

    }

    /**
     * 输入id,判断是否被占用,若没有,则数如新的姓名,添加到stu中
     *
     */
    public void addmap(){

        Scanner scan = new Scanner(System.in);
        int i = 0;
       while(i<3){
            System.out.println("input stu'id");
            String id = scan.next();
            Stu st = student.get(id);
            if(st==null){
                System.out.println("input stu'name");
                String name = scan.next();
                Stu newstu = new Stu(id ,name);
                student.put(id,newstu);
                System.out.println("success :"+student.get(id).name);
                i++;

            }else{
                System.out.println("id has been occupied");
                continue;
            }
        }

    }

    /**
     * 测试keymap方法
     * 通过keymap方法返回所有键的set集合
     */


    public void testKeySet(){

        Set<String> keyset = student.keySet();
        System.out.println("size= "+student.size());
        for (String stuid:keyset) {

            Stu st = student.get(stuid);
            if(st!=null){
                System.out.println("stu:"+st.name);
            }

        }

    }

    public void testremove(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("input id(remove)");
            String id = scan.next();
            Stu st = student.get(id);
            if(st==null){
                System.out.println("null");
                continue;
            }else{
                student.remove(id);
                System.out.println("success to remove");
                break;
            }
        }

    }

    public void testEntrySet(){
        //通过entryset反悔所有键值对
       Set<Map.Entry<String, Stu>> entryset = student.entrySet();
        for(Map.Entry<String,Stu> entry:entryset){
            System.out.println("key="+entry.getKey());
            System.out.println("value="+entry.getValue().name);
        }
    }

    /**
     * 修改map中的属性
     * @param
     */
    public void testModify(){
        System.out.println("input id(modify)");
        Scanner scan = new Scanner(System.in);
        while(true){
            String id = scan.next();
            Stu stu = student.get(id);
            if(stu == null){
                System.err.println("this id is null");
                continue;
            }
            System.out.println("student'name="+stu.name);
            System.out.println("input new stu'name");
            String name = scan.next();
            Stu newstu = new Stu(id,name);
            student.put(id,newstu);
            System.out.println("success");
            break;
        }

    }

    /**
     * 测试map中是否包含key或value
     *
     * @param
     */
    public void testContainskeyvalue(){
        //containskey   containsvalue
        System.out.println("请输入查询学生id");
        String id = scan.next();
        System.out.println("输入的学生id: "+id+"在学生映射中"+student.containsKey(id));
        if(student.containsKey(id)){
            System.out.println("学生姓名:"+student.get(id).name);
        }
        System.out.println("输入学生姓名");
        String name = scan.next();
        System.out.println("输入的学生id: "+id+"在学生映射中"+student.containsValue(new Stu(null,name)));
        if(student.containsValue(new Stu(null,name))){
            System.out.println("在学生映射表中,包含此学生:"+name);
        }else {
            System.out.println("不存在");
        }
    }

    public static void main(String[] args) {
        MapTest mt = new MapTest();
        mt.addmap();
        mt.testKeySet();//mt.testremove();
       // mt.testModify();
       // mt.testEntrySet();
        mt.testContainskeyvalue();

    }


}
