package com;

public class Prime {
    public boolean chick(int number) {
        if (number <= 3)
            return number>1;
        int center = (int)Math.sqrt(number);
        for (int i = 2; i <= center; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
