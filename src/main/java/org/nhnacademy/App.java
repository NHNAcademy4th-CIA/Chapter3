package org.nhnacademy;

import org.nhnacademy.domain.Dice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("{}",Q1());

    }

    public static int Q1() {
        int pip1 = 0;
        int pip2 = 0;
        int count = 0;
        while (!isSnakeEye(pip1, pip2)) {
            pip1 = Dice.roll();
            pip2 = Dice.roll();
            count++;
            logger.info("{}번째 시도 \n 1번 주사위 {} \n 2번 주사위 {}",count,pip1,pip2);
        }
        return count;
    }

    private static boolean isSnakeEye(int pip1, int pip2) {
        return pip1 + pip2 == 2;
    }
}
