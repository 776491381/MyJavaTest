package cn.fyy.Easypoke;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by FYY on 7/19/16.
 */
public class Player {

    public String id;
    public String name;
    public Set<Poke> haspoke;
    public Player(String id, String name) {
        this.name = name;
        this.id = id;
        this.haspoke = new HashSet<Poke>();
    }
}
