package cn.fyy.TestArrayList;

import javax.security.auth.login.FailedLoginException;

/**
 * Created by FYY on 7/16/16.
 */
public class Course {

    public String id;
    public String name;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj==null)return false;
        if(!(obj instanceof Course))return false;
        Course cr = (Course) obj;
        if(this.name==null){
            if(cr.name==null)return true;
            else return false;

        }else {
            if(this.name.equals(cr.name))return true;
            else return false;
        }



    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public Course(){

    }
}
