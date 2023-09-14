package org.nhnacademy;

import java.io.FileNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) throws FileNotFoundException {
        logger.info("exercise 1 : {}", Exercise1.exercise1());
        Exercise2.exercise2();
        Exercise3.exercise3();
        logger.info("exercise 4 : {}", Exercise4.exercise4());
        Exercise5.exercise5();
        Exercise6.exercise6();
        Exercise7.exercicse7();
    }
}
