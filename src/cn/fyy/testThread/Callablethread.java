package cn.fyy.testThread;

import com.sun.corba.se.impl.orbutil.closure.Future;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by FYY on 6/29/16.
 */
public class Callablethread {
    public static void main(String[] args) {
        //创建线程
        ExecutorService ser = Executors.newFixedThreadPool(1);
        Race tor = new Race();
        //获取值
        //  Future<Integer> result = ser.submit(tor);
        //  int num = result.get();

    }
}
class Race implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        return 1000;
    }
}