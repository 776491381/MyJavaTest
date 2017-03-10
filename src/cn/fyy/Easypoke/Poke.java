package cn.fyy.Easypoke;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FYY on 7/19/16.
 */
public class Poke implements Comparable<Poke>{
    public String  id;
    public String name;

    public Poke(String id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Poke o) {
        return this.id.compareTo(o.id);
    }
}
