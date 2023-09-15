package org.nhnacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem6 {

    public static final Logger logger = LoggerFactory.getLogger(Problem6.class);

    public static int checkDivisor(List<Integer> list, int num) {

        Map<Integer, Integer> m = new HashMap<>();


        while (num > 1) {
            for (int i = 0; i < list.size(); i++) {
                int number = list.get(i);
                if (num % number == 0) {
                    num /= number;
                    if (m.get(number) == null) {
                        m.put(number, 1);
                    } else {
                        m.put(number, m.get(number) + 1);
                    }
                    break;
                }
            }
        }

        int result = 1;


        for (int divisor : m.values()) {
            result *= (divisor + 1);
        }

        return result; // 약수개수
    }

    public static List<Integer> makeList() {

        List<Integer> list = new ArrayList<>(); // 약수 넣어

        int[] number = new int[10001];


        for (int i = 2; i <= Math.sqrt(10000); i++) {
            for (int j = i * i; j <= 10000; j += i) {
                number[j] = 1;
            }
        }

        for (int i = 2; i <= 10000; i++) {
            if (number[i] == 0) {
                list.add(i);
            }
        }

        return list;

    }

    public static void problem6() {

        List<Integer> list = makeList();

        List<Pair> answer = new ArrayList<>();


        for (int i = 2; i <= 10000; i++) {
            int num = 1;

            if (!list.contains(i)) {
                num = checkDivisor(list, i);
                answer.add(new Pair(num, i));
            }
        }

        Collections.sort(answer);

        Pair flag = answer.get(0);

        for (int i = 0; i < answer.size(); i++) {


            if (flag.getDivisorNumber() == answer.get(i).getDivisorNumber()) {
                logger.info("가장 많은 약수를 가진 정수 {} , 약수의 개수는 {}", answer.get(i).getDivisorNumber(), answer.get(i).getNumber());
            } else {
                return;
            }
        }


    }

}

class Pair implements Comparable {

    private final int divisorNumber;
    private final int number;


    public Pair(int divisorNumber, int number) {
        this.divisorNumber = divisorNumber;
        this.number = number;
    }

    public int getDivisorNumber() {
        return divisorNumber;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Object o) {
        Pair p = (Pair) o;
        return p.divisorNumber - this.divisorNumber;
    }


}