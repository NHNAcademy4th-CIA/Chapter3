package org.nhnacademy;

import java.io.File;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    static int count;
    static void playGame() {
        int count;
        count = 4;
        System.out.println("in method : count = " + count);
        System.out.println(App.count);
    }
    public static void main(String[] args) {
        count = 5;
        playGame();
        System.out.println(count);

    }
}
