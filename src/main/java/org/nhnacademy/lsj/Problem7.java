package org.nhnacademy.lsj;

import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem7 {


    private static Logger logger = LoggerFactory.getLogger(Problem7.class);

    public static void problem7() {
        problem7_1();
        problem7_2();
        problem7_3();
    }

    public static void problem7_1() {

        int[] arr = new int[366];
        int count = 0;
        while (true) { // if문을 while문 안에 넣어서 하기
            int birthDay = (int) (Math.random() * 365 + 1);
            arr[birthDay]++;
            count++;
            if (arr[birthDay] == 3) {
                logger.info("생일이 같은 세 사람을 뽑기 까지 {}번 시행", count);
                return;
            }
        }
    }

    public static void problem7_2() {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 365; i++) {
            int birthDay = (int) (Math.random() * 365 + 1);
            set.add(birthDay);
        }

        logger.info("총 생일 수는 {}", set.size());
    }

    public static void problem7_3() {

        Set<Integer> set = new HashSet<>();
        long count = 0;

        while (true) { // if문 조건으로 쓰기
            int birthDay = (int) (Math.random() * 365 + 1);
            set.add(birthDay);
            count++;
            if (set.size() == 365) {
                logger.info("최소 한명 씩 찾기위한 시도횟수는 {}", count);
                return;
            }
        }

    }

}
