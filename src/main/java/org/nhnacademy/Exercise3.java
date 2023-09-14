package org.nhnacademy;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise3 {
    private static final String number = "\\d*\\.*\\d*";
    private static final String operator = "^[+|\\-|*|/]?$";
    private static final Logger logger = LoggerFactory.getLogger(Exercise3.class);

    public static void exercise3() {
        String[] expression = new String[3];
        StringTokenizer st;
        boolean flag = true;
        String input;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            logger.info("Enter simple expression : ");
            input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            st = new StringTokenizer(input);
            for (int i = 0; st.hasMoreTokens(); i++) {
                String s = st.nextToken();
                if (Pattern.matches(number, s) || Pattern.matches(operator, s)) {
                    expression[i] = s;
                } else {
                    flag = false;
                }
            }
            if (flag) {
                logger.info("{} {} {} = {}", expression[0], expression[1], expression[2], calc(expression));
            } else {
                logger.warn("wrong input");
            }
        }
    }

    private static double calc(String[] expression) {
        double num1 = Double.parseDouble(expression[0]);
        double num2 = Double.parseDouble(expression[2]);

        switch (expression[1]) {
            case "+":
                return num1 + num2;
            case "*":
                return num1 * num2;
            case "-":
                return num1 - num2;
            case "/":
                return num1 / num2;
            default:
                return -1;
        }
    }
}
