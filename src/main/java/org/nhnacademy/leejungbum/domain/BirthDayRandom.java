package org.nhnacademy.leejungbum.domain;

import java.util.Arrays;

public class BirthDayRandom {
    private static int number[] = new int[365];
    private static boolean isNumber[] = new boolean[365];

    public static int random() {
        int ran = (int) (Math.random() * 365);
        number[ran]++;
        isNumber[ran]=true;
        return ran;

    }

    private BirthDayRandom() {
    }

    public static boolean Day3(int ran) {
        if(number[ran]<=2)
        {
            return false;
        }
        return true;
    }

    public static boolean isPresent() {
        return Arrays.stream(number)
                .anyMatch(x -> x == 0);
    }

    public static int trueCount()
    {
        int count = 0;
        for(boolean b : isNumber)
        {
            if(b==true)
            {
                count++;
            }
        }
        return count;
    }

}
