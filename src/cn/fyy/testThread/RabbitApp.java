package cn.fyy.testThread;

/**
 * Created by FYY on 6/29/16.
 */
public class RabbitApp {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tortoise tortoise = new Tortoise();
        for(int i = 0;i<100;i++){
            System.out.println("main==>"+i);
        }
        rabbit.start();
        tortoise.start();
    }
}
