package cn.fyy.TestArrayList;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by FYY on 7/16/16.
 */
public class Stu implements Comparable<Stu>{

    public String id;
    public String name;
    public Set<Course> courses;

    public Stu(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet<Course>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stu stu = (Stu) o;

        return name != null ? name.equals(stu.name) : stu.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public int compareTo(Stu o) {

        return this.id.compareTo(o.id);//通过id保存

    }
}
