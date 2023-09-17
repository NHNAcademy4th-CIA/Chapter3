package org.nhnacademy.leejungbum.domain;

import java.util.Arrays;

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
                if(lastNum==number)
                {
                    count--;
                }
            }
        }
        return count;
    }
    public static boolean isPresent(int[] list, int x) {
        return Arrays.stream(list)
                .anyMatch(b -> b == x);
    }
}
