package cn.fyy.Easypoke;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by FYY on 7/19/16.
 */
public class sendPoke {

    public createpoke cp;
    private Scanner scan;

    public sendPoke() {
        scan = new Scanner(System.in);
        cp = new createpoke();
    }

    public void createplayerandsend(){
        Random random = new Random();
        System.out.println("请输入玩家id");
        String id = scan.next();
        System.out.println("请输入玩家name");
        String name = scan.next();
        Player pl1 = new Player(id,name);
        System.out.println("请输入玩家id");
        String id2 = scan.next();
        System.out.println("请输入玩家name");
        String name2 = scan.next();
        Player pl2 = new Player(id2,name2);
        System.out.println("pl1 id "+pl1.id+" pl1 name "+pl1.name);
        System.out.println("pl2 id "+pl2.id+" pl2 name "+pl2.name);

        for(int i=0;i<2;i++){
            pl1.haspoke.add(cp.poke.get(i));
            pl2.haspoke.add(cp.poke.get(i+2));
        }
        foreach(pl1);
        foreach(pl2);


    }
    public void foreach(Player p){
        for(Poke q:p.haspoke){
            System.out.println(p.name+"'poke"+" "+q.name);
        }
    }


}
