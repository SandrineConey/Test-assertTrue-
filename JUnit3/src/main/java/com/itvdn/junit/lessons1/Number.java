package com.itvdn.junit.lessons1;

public class Number {
    public int sum(int number){
        int result = 0;
        for(int i = 0; i<=number;i++){
            result += i;
        }
        return result;
    }
}
