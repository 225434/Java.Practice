package 文件;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class File_test1 {
    public static void main(String[] args) throws Exception{
        File file = new File("文档/test1.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("千山鸟飞绝");

    }
}
