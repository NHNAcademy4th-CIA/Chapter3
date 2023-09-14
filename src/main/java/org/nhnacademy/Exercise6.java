package org.nhnacademy;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise6 {
    private static final Logger logger = LoggerFactory.getLogger(Exercise6.class);

    public static void exercise6() {
        int maxDivisor = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        /**
         * max divisor
         * max number
         */
        for (int i = 1; i < 10000; i++) {
            int count = gcp(i);
            if (count > maxDivisor) {
                maxDivisor = count;
                numbers.clear();
                numbers.add(i);
            }
            else if(count==maxDivisor) {
                numbers.add(i);
            }
        }
        logger.info("Among integers between 1 and 10000, \n The" +
                "maximum number of divisors was {}\n" +
                "Numbers with that many divisors include: {}", maxDivisor, numbers);
    }

    static int gcp(int i) {
        int count = 0;
        for (int j = 2; j <= i; j++) {
            if (i % j == 0) {
                count++;
            }
        }
        return count;
    }
}
