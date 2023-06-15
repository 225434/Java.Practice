package 字节流;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class copy {
    public static void main(String[] args) throws Exception{
        File file = new File("文档/poetry.txt");
        FileReader fileReader = new FileReader(file);
        char[] buff = new char[1024];
        int length;
        if ((length =fileReader.read(buff)) == -1)
            System.out.println("error");
        char[] buffs = new char[length];
        System.arraycopy(buff,0,buffs,0,length);
        FileWriter fileWriter = new FileWriter("文档/test1.txt");
        fileWriter.write(buffs);
        fileReader.close();
        fileWriter.close();
        System.out.println("done!");
    }
}
