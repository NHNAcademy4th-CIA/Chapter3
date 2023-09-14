package org.nhnacademy;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {
    Exercise4() {

    }

    public static String exercise4() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb;
        ArrayList<String> answer = new ArrayList<>();

        for (String str : scanner.nextLine().split(" ")) {
            sb = new StringBuilder();
            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch) || ch == '\'') {
                    sb.append(ch);
                }
            }
            answer.add(sb.toString());
        }
        return addLineBreak(answer);
    }
    private static String addLineBreak(ArrayList<String> answer) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i));
            if(i!= answer.size()-1) {
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}
