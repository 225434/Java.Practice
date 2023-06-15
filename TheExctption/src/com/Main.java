package com;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("00001",null,22);
        try {
            if (s.age>75)
                throw new Beyond(s.age);
            if (s.age<3)
                throw new Less(s.age);
            if (s.name==null)
                throw new Name();
            System.out.println(s.id+"\t"+s.name+"\t"+s.age);
        } catch (Beyond e) {
            e.getMessage();
        } catch (Less e) {
            e.getMessage();
        } catch (Name e) {
            e.getMessage();
        }
    }
}
