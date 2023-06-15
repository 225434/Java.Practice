package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //
        Socket socket = new Socket(InetAddress.getLocalHost(),9527);
        System.out.println("客户端 socket 返回 = " + socket.getClass());
        //输入
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello server".getBytes());
        socket.shutdownOutput();
        //读取
        InputStream inputStream = socket.getInputStream();
        byte[] buff = new byte[1024];
        int length;
        while ((length = inputStream.read(buff)) != -1) {
            System.out.println(new String(buff,0,length));
        }
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("done!");
        System.out.println("客户端已关闭!");
    }
}
