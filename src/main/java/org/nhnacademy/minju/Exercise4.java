package org.nhnacademy.minju;

import java.util.ArrayList;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise4 {
    public static void exercise4() {
        Scanner scanner = new Scanner(System.in);
        Logger logger = LoggerFactory.getLogger(Exercise4.class);
        StringBuilder sb;

        for (String str : scanner.nextLine().split(" ")) {
            sb = new StringBuilder();
            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch) || ch == '\'') {
                    sb.append(ch);
                }
            }
            logger.info("{}", sb);
        }
    }
}
