package org.nhnacademy;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;
import org.nhnacademy.domain.Dice;
import org.nhnacademy.domain.Divisors;
import org.nhnacademy.domain.Expressions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static StringTokenizer stringTokenizer;
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("{}", Q1());
        logger.info("1~10000중 가장 큰 값은? {}", Q2());
        Q3();
    }

    public static int Q1() {
        int pip1 = 0;
        int pip2 = 0;
        int count = 0;
        while (!isSnakeEye(pip1, pip2)) {
            pip1 = Dice.roll();
            pip2 = Dice.roll();
            count++;
            logger.info("{}번째 시도 \n 1번 주사위 {} \n 2번 주사위 {}", count, pip1, pip2);
        }
        return count;
    }

    public static int Q2() {
        int max = 0;
        for (int i = 1; i <= 10000; i++) {
            int count = Divisors.count(i);
            max = (max < count) ? i : max;
        }

        return max;
    }
    public static void Q3(){
        logger.info("식을 작성해주세요. : ");
        while(true) {
            try {
                stringTokenizer = new StringTokenizer(scanner.nextLine());
                double leftValue = Double.parseDouble(stringTokenizer.nextToken());
                if (leftValue == 0) {
                    break;
                }
                String operator = stringTokenizer.nextToken();
                double rightValue = Double.parseDouble(stringTokenizer.nextToken());

                logger.info("{}", new Expressions(leftValue, operator, rightValue));
            }catch (NoSuchElementException e)
            {
                logger.warn("입력값의 필수 인자는 3개입니다. 만일 종료 하고싶으시면 0을 입력해주세요.");
            }catch (IllegalArgumentException e)
            {
                logger.warn(e.toString());
            }
        }
    }

    private static boolean isSnakeEye(int pip1, int pip2) {
        return pip1 + pip2 == 2;
    }
}
