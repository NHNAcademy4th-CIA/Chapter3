package org.nhnacademy;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem1 {


    private static final Logger logger = LoggerFactory.getLogger(Problem1.class);

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




}
