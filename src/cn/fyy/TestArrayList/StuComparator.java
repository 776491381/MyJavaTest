package cn.fyy.TestArrayList;

import java.util.Comparator;

/**
 * Created by FYY on 7/19/16.
 */
public class StuComparator implements Comparator<Stu> {



    @Override
    public int compare(Stu o1, Stu o2) {
        return o1.name.compareTo(o2.name);
    }



}
