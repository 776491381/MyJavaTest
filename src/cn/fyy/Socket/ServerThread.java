package cn.fyy.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by FYY on 7/22/16.
 */
public class ServerThread extends Thread {

    Socket socket = null;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStreamReader isr = null;
        BufferedReader br=null;
        PrintWriter pw=null;
        try {
            isr = new InputStreamReader(socket.getInputStream());
            pw = new PrintWriter(socket.getOutputStream());
            br = new BufferedReader(isr);
            String info = null;
            while((info=br.readLine())!=null){
            System.out.println("我是服务器,客户端说"+info);
              }
             pw.write("欢迎");
              pw.flush();
            socket.shutdownInput();
            socket.shutdownOutput();
    } catch (IOException e) {
            e.printStackTrace();
    }finally{

            pw.close();
            try{
                isr.close();
                br.close();
                socket.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
