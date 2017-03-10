package cn.fyy.TestArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * 排序
 * Created by FYY on 7/19/16.
 */
public class collectiontest {

    public void testsort1(){
        List<Integer>integerList = new ArrayList<Integer>();
        Random random = new Random();
        Integer k;
        for(int i = 0;i<10; i++){
            do{
            k=random.nextInt(100);
        }while(integerList.contains(k));//保证不重复
            integerList.add(k);
            System.out.println("成功添加整数 "+k+" ");
    }
        System.out.println("---------排序前---------");
        for(Integer j : integerList){
            System.out.print(" "+j);
        }
        System.out.println();
        Collections.sort(integerList);
        System.out.println("---------排序后---------");
        for(Integer j : integerList){
            System.out.print(" "+j);
        }
    }

    public void testsort2(){
        List<Stu>studentlist = new ArrayList<Stu>();
        studentlist.add(new Stu("4","qqq"));
        studentlist.add(new Stu("2","www"));
        studentlist.add(new Stu("3","eee"));
        System.out.println("---------排序前---------");
        for(Stu s:studentlist){
            System.out.print("学生 :"+s.name);
        }
        System.out.println();
        Collections.sort(studentlist);
        System.out.println("---------排序后---------");
        for(Stu s:studentlist){
            System.out.print("学生 :"+s.name);
        }
        System.out.println("---------按姓名排序后---------");
        Collections.sort(studentlist,new StuComparator());
        for(Stu s:studentlist){
            System.out.print("学生 :"+s.name);
        }

    }
    public static void main(String[] args) {
        collectiontest ct = new collectiontest();
        //ct.testsort1();
        ct.testsort2();
    }
}
