package org.nhnacademy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem {


    private static final Logger logger = LoggerFactory.getLogger(Problem.class);

    public static void problem1() {

        int count = 0;
        while (true) {

            int num1 = (int) (Math.random() * 6 + 1);
            int num2 = (int) (Math.random() * 6 + 1);
            count++;

            if (num1 == num2 && num1 == 1) {
                logger.info("총 주사위 돌린 횟수 {}", count);
                return;
            }
        }
    }

    public static void problem2(){

        int []primeNumber = new int[10001];

        primeNumber[0]=0;

        // 약수의 개수 = 소인수분해 했을때
        // 소인수의 지수에 1을 더한 수들을 곱한 값


        for(int i=1;i<=10000;i++){

        }


    }

}
