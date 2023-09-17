package org.nhnacademy.leejungbum;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;
import org.nhnacademy.leejungbum.domain.*;
import org.nhnacademy.leejungbum.domain.Operator.Expressions;
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
//        logger.info("{}", Q1());
//        logger.info("1~10000중 가장 큰 값은? {}", Q2());
//        Q3();
//        Q4();
        Q5();
//        q6();
//        Q7();
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
        int bigIndex = 0;
        for (int i = 1; i <= 10000; i++) {
            int count = Divisors.count(i);
            logger.info("{} {}",i,count);
            if(max < count) {
                max=count;
                bigIndex =i;
            }
        }

        return bigIndex;
    }

    public static void Q3() {
        logger.info("식을 작성해주세요. : ");
        while (true) {
            try {
                stringTokenizer = new StringTokenizer(scanner.nextLine());
                double leftValue = Double.parseDouble(stringTokenizer.nextToken());
                if (leftValue == 0) {
                    break;
                }
                String operator = stringTokenizer.nextToken();
                double rightValue = Double.parseDouble(stringTokenizer.nextToken());

                Expressions expressions = new Expressions(leftValue, operator, rightValue);
                logger.info("{}",expressions.apply());
            } catch (NoSuchElementException e) {
                logger.warn("입력값의 필수 인자는 3개입니다. 만일 종료 하고싶으시면 0을 입력해주세요.");
            } catch (IllegalArgumentException e) {
                logger.warn(e.toString());
            }
        }
    }

    public static void Q4() {
        String line = "He said, \"That's not a good idea.\"";
        List<String> answer = EnglishToken.split(line);
        for (String s : answer) {
            logger.info("{}",s);
        }
    }

    public static void Q5() {
        File note = new File("src/main/resources/sales.dat");
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(note))){
            String line;

            while (!((line = br.readLine()) == null)) {
                try {
                    StringTokenizer stringTokenizer = new StringTokenizer(line, ":");
                    String name = stringTokenizer.nextToken();
                    String value = stringTokenizer.nextToken();
                    System.out.println(name+"///"+value);
                    new City(name, value);
                } catch (NoSuchElementException e) {
//                    logger.warn("no report received");
                    count++;
                }
            }
        } catch (IOException e) {
            logger.warn("파일이 존재하지 않습니다.");
        }
        logger.info("총 매출은 {} 보고안한 도시수 {}", City.getTotalSale(), count);
    }
    public static void q6(){
            int max = 0;
            int maxArray[] = new int[10000];
            for (int i = 1; i <= 10000; i++) {
                int count = Divisors.count(i);
                logger.info("{} {}",i,count);
                maxArray[i-1] = count;
                if(max < count) {
                    max=count;
                }
            }
        logger.info("1부터 10000 사이의 정수 중에서,");
            logger.info("최대 제수 수는 {}였습니다.",max);
            logger.info("제수가 많은 숫자는 다음과 같습니다.");
        int i=1;

        for(int a : maxArray)
            {
                if(a==max)
                {
                    logger.info("{}",i);
                }
                i++;
            }

    }
    public static void Q7() {
        int count = 0;
        int day;
        do {
            day = BirthDayRandom.random();
            count++;
        } while (!BirthDayRandom.Day3(day));
        logger.info("가장먼저 3일이 된 날짜는 {}",day);
        while (count<=365)
        {
            BirthDayRandom.random();
            count++;
        }
        logger.info("365일 이후 1일이상 나온 날짜 수 {}",BirthDayRandom.trueCount());
        while (BirthDayRandom.isPresent())
        {
            BirthDayRandom.random();
            count++;
        }
        logger.info("365일이 다 한번이상 나올때까지 몇번 시도 {}",count);


    }

    private static boolean isSnakeEye(int pip1, int pip2) {
        return pip1 + pip2 == 2;
    }
}
