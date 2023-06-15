package Externalizable;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Student student = new Student();
        student.setName("Tom");
        student.setSex("男");
        student.setAge(23);
        //
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:/Temp/student1.txt"));
        out.writeObject(student);
        out.close();
        //
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/Temp/student1.txt"));
        Student student1 = (Student)in.readObject();
        System.out.println(student1.toString());
        in.close();
        //
        System.out.println("done!");
    }
}
