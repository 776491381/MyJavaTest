package cn.fyy.testThread;

/**
 * Created by FYY on 16/6/15.
 */
public class test02 {
    public static void main(String[] args) {

        for(int i = 0; i<5; i++)
            new Thread(new myThread(i+1)).start();
    }
    static class myThread implements Runnable{

        int count = 1;
        int number;
        public myThread(int num){
            number = num;
            System.out.println("create thread:"+number);
        }

        @Override
        public void run() {
            while(true)
            {
                System.out.println("thread "+number+": count "+count);
                if(++count==6)return;
            }
        }
    }

}
