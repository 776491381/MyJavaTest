package cn.fyy.testThread;

import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by FYY on 7/1/16.
 */
public class Bank {

    class MyBank {


        private int account = 100;
        private Lock lock = new ReentrantLock();
        public int getAccount(){
            return account;
        }
        public void save(int money){
            lock.lock();
            try{
            account+=money;
              }finally {
                lock.unlock();
            }
        }
    }
    class NewThread implements Runnable{

        private MyBank bank;
        public NewThread(MyBank bank){
            this.bank=bank;
        }

        @Override
        public void run() {
            for(int i= 0; i <10 ; i++){
                bank.save(10);
                System.out.println(Thread.currentThread().getName()+"    "+(i+1)+"  账户余额:  "+bank.getAccount());
            }
        }



    }
    public void useThread(){
        MyBank bank = new MyBank();
        NewThread newthread = new NewThread(bank);
        System.out.println("thread1");
        Thread thread1 = new Thread(newthread,"thread1");
        System.out.println("thread2");
        Thread thread2 = new Thread(newthread,"thread2");
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        Bank st = new Bank();
        st.useThread();
    }
}

