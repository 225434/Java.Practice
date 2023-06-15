package 转换流;

import java.io.*;

public class copy {
    public static void main(String[] args) throws Exception{
        File file = new File("文档/test");
        File file1 = new File("文档/诗.txt");
        InputStreamReader bufferedReader = new InputStreamReader(new FileInputStream(file));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file1));
        int in;
        while ((in = bufferedReader.read()) != -1) {
            outputStreamWriter.write(in);
        }
        outputStreamWriter.flush();
    }
}
