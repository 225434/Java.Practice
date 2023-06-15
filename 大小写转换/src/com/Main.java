package com;
import java.util.*;

public class Main {
    public static void main(String[] args){
        char character;
        try {
            Scanner sc = new Scanner(System.in);
            character = sc.next().charAt(0);
            if (character >= 'a' && character <= 'z') {
                System.out.println(character);
            }
            else if (character >='A' && character <= 'Z') {
                System.out.println((char)(character + 32));
            }
            else {
                throw new MEx("输入" + character + "不是字母");
            }
        } catch (MEx e)
        {
            System.out.println(e.getMessage());
        }
    }
}
