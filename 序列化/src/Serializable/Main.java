package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setName("Jack");
        student.setSex("男");
        student.setAge(22);
        //
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:/Temp/student.txt"));
        out.writeObject(student);
        out.close();
        //
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/Temp/student.txt"));
        Student student1 = (Student)in.readObject();
        System.out.println(student1.toString());
        in.close();
        //
        System.out.println("done!");
    }
}
