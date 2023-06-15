package 练习;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ps {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("文档/test");
        PrintStream printStream = new PrintStream(file);
        printStream.println("千山鸟飞绝，万径人踪灭");
    }
}
