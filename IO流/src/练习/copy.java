package 练习;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copy {
    public static void main(String[] args) throws Exception{
        File file = new File("文档/截图.png");
        File file1 = new File("文档/备份.jpg");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        int length = fileInputStream.available();
        byte[] buff = new byte[length];
        if (fileInputStream.read(buff) == -1) return;
        fileOutputStream.write(buff);
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("done!");
    }
}
