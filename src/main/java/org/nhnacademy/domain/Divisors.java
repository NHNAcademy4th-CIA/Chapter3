package org.nhnacademy.domain;

public class Divisors {
    private Divisors(){}
    public static int count(int number){
        int count =2;
        int lastNum = number;
        for (int i= count;i<lastNum;i++)
        {
            if(number%i==0)
            {
                lastNum = number/i;
                count+=2;
            }
        }
        return count;
    }
}
