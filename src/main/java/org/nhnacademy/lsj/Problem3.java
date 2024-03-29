package org.nhnacademy.lsj;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem3 {


    private static final Logger logger = LoggerFactory.getLogger(Problem3.class);
    private static final String numberRegex = "^[0-9]+[.0-9]*$";
    private static final String operatorRegex = "^[+\\-*/.]$";

    private static final String[] regexArray= {numberRegex,operatorRegex};


    public static void problem3() {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(str);

        String[] result = new String[3];


        for (int i = 0; stringTokenizer.hasMoreTokens(); i++) {

            String number = stringTokenizer.nextToken();
                if (Pattern.matches(regexArray[i%2], number)) { // 패턴맞으면
                    result[i] = number;
                    continue;
                }
                throw new IllegalArgumentException("잘못된 입력입니다.");
        }

        logger.info("계산 결과는 {}", evaluate(result));


    }

    public static double evaluate(String[] str) {

        if (str[1].equals("*")) {
            return Double.parseDouble(str[0]) * Double.parseDouble(str[2]);
        } else if (str[1].equals("/")) {
            return Double.parseDouble(str[0]) / Double.parseDouble(str[2]);
        } else if (str[1].equals("-")) {
            return Double.parseDouble(str[0]) - Double.parseDouble(str[2]);
        } else if (str[1].equals("+")) {
            return Double.parseDouble(str[0]) + Double.parseDouble(str[2]);
        }
        throw new IllegalArgumentException("잘못된 입력입니다..... ");
    }


}
