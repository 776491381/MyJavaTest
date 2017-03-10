package cn.fyy.Easypoke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by FYY on 7/19/16.
 */
public class createpoke {

    List<Poke>poke = new ArrayList<Poke>();
    Random random = new Random();
    String[] a={"方块2","方块3","方块4","黑桃2","黑桃3","黑桃4","红桃2","红桃3","红桃4","梅花2","梅花3","梅花4"};
    public createpoke() {
        System.out.println("正在创建扑克");
        for(int i=0;i<12;i++){
            String id=random.nextInt(100)+"";
        poke.add(new Poke(id,a[i]));
    }
        System.out.println("创建扑克成功");
        Collections.sort(poke);
        for(Poke q:poke){
            System.out.println(q.id+" "+q.name);
        }

    }
}
