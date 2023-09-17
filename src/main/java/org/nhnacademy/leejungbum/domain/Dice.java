package org.nhnacademy.leejungbum.domain;

public class Dice {
    private static final int pip = 6;

    private Dice() {

    }

    public static int roll() {
        return (int) (Math.random() * pip) + 1;
    }
}
