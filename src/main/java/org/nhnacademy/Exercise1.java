package org.nhnacademy;

class Exercise1 {
    // 주사위 두 눈이 모두 1이 나올때까지의 굴린 횟수

    public static int exercise1() {
        int random1;
        int random2;
        int count = 0;
        do  {
            random1 = (int) (Math.random() * 6) + 1;
            random2 = (int) (Math.random() * 6) + 1;
            count++;
        }while (!(random1 == 1 && random2 == 1));
        return count;
    }
}
