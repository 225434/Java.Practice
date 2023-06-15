package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //
        ServerSocket serverSocket = new ServerSocket(9527);
        System.out.println("服务器正在9527端口监听，等待连接......");
        Socket socket = serverSocket.accept();
        System.out.println("服务器端 socket = " + socket.getClass());
        //读取
        InputStream inputStream = socket.getInputStream();
        byte[] buff = new byte[1024];
        int length;
        while ((length = inputStream.read(buff)) != -1) {
            System.out.println(new String(buff,0,length));
        }
        //写入
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello client".getBytes());
        socket.shutdownOutput();
        //关闭
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("done!");
        System.out.println("服务器已关闭！");
    }
}
