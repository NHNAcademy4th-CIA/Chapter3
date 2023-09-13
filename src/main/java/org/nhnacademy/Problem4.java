package org.nhnacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem4 {


    private static final Logger logger = LoggerFactory.getLogger(Problem4.class);
    public static void go() {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        List<String> list = new ArrayList<>();

        String temp = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i))) {
                temp += str.charAt(i);
            } else {
                if (!temp.isEmpty()) {
                    list.add(temp);
                    temp = "";
                }
            }
        }

        for (String a : list) {
            logger.info(a);
        }


    }

}
