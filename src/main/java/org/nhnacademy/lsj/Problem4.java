package org.nhnacademy.lsj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem4 {


    private static final Logger logger = LoggerFactory.getLogger(Problem4.class);

    public static void problem4() {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        List<String> list = new ArrayList<>();

        String temp = "";


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) || ch == '\'') {

                if(ch=='\''){
                    if(!temp.isEmpty()) // 앞뒤로 있어야 추가해줄꺼야
                        temp += ch;
                }

            }
            else{
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
