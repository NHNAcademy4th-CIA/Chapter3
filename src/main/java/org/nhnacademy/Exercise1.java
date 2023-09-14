package org.nhnacademy;

class Exercise1 {
    // 주사위 두 눈이 모두 1이 나올때까지의 굴린 횟수

    private Exercise1() {
    }

    public static int exercise1() {
        int random1 = (int) (Math.random() * 6) + 1;
        int random2 = (int) (Math.random() * 6) + 1;
        int count = 0;
        while (!(random1 == 1 && random2 == 1)) {
            random1 = (int) (Math.random() * 6) + 1;
            random2 = (int) (Math.random() * 6) + 1;
            count++;
        }
        return count;
    }
}
