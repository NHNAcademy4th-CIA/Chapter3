package org.nhnacademy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Exercise2 {
    private static final Logger logger = LoggerFactory.getLogger(Exercise2.class);
    public static int[] exercise2() {
        int maxCount = 0;
        int number = 2;
        for (int i = 1; i < 10000; i++) {
            int count = gcp(i);
            if (count > maxCount) {
                maxCount = count;
                number = i;
            }
        }
        logger.info("number is {}, number of divisor : {}", number, maxCount);
        return new int[] {number, maxCount};
    }

    private static int gcp(int i) {
        int count = 0;
        for (int j = 2; j <= i; j++) {
            if (i % j == 0) {
                count++;
            }
        }
        return count;
    }
}
