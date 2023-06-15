package 文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_test {
    public static void main(String[] args) throws Exception {
        File file = new File("文档/test.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileInputStream fileInputStream = new FileInputStream(file);
//        fileOutputStream.write("云深不知处".getBytes());
        byte[] buff = new byte[fileInputStream.available()];
//        int length;
//        while ((length = fileInputStream.read(buff)) != -1) {
//            System.out.println(new String(buff, 0, length));
//        }
        if (fileInputStream.read(buff) == -1)
            System.out.println("error");
        String s = new String(buff);
        System.out.println(s);
//        fileOutputStream.close();
        fileInputStream.close();
    }
}
