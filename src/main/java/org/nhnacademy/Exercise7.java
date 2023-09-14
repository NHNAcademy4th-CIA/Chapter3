package org.nhnacademy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise7 {
    private static final Logger logger = LoggerFactory.getLogger(Exercise7.class);

    public static void exercicse7() {
        // 돌린 횟수
        // 다른 생일을 가진 사람(365명 중)
        // 같은 생일을 찾기 전까지 몇명을 거쳤나
        logger.info("you checked {} people before you find three people who share " +
                "same birthday", q1());
        logger.info("{} people have different birthday.", q2());
        logger.info("you checked {} people before you've found " +
                "at least one person with a birthday on each of the 365 days of the year.", q3());
    }

    private static int q1() {
        int count = 0;
        int[] checked = new int[365];
        while (true) {
            int birthday = (int) (Math.random() * 365);
            count++;

            if (checked[birthday] == 3) {
                break;
            }

            checked[birthday] += 1;

        }
        return count;
    }

    private static int q2() {
        int count = 0;
        int difBirthday = 0;
        boolean[] checked = new boolean[365];

        while (count <= 365) {
            int birthday = (int) (Math.random() * 365);
            count++;

            if (!checked[birthday]) {
                checked[birthday] = true;
            }
        }
        for (boolean b : checked) {
            if (!b) {
                difBirthday++;
            }
        }
        return difBirthday;
    }

    private static int q3() {
        int count = 0;
        boolean[] checked = new boolean[365];
        while (true) {
            int birthday;
            birthday = (int) (Math.random() * 365);
            count++;

            if (checked[birthday]) {
                break;
            }

            checked[birthday] = true;

        }
        return count;
    }

}
