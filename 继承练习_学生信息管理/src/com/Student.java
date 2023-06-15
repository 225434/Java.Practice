package com;

public class Student extends Person{
    String id;

    public Student(String name, int age, String sex, String id) {
        super(name, age, sex);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
