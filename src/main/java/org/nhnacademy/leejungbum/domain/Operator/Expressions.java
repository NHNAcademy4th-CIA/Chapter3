package org.nhnacademy.leejungbum.domain.Operator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expressions {
    private final double leftValue;
    private final double rightValue;
    private final String operator;
    private final String pattern = "^[+|\\- |*|/]$";

    public Expressions(double leftValue, String operator, double rightValue){
        this.leftValue=leftValue;
        this.rightValue=rightValue;
        Matcher matcher = Pattern.compile(pattern).matcher(operator);
        if(!matcher.find()){
            throw new IllegalArgumentException("+, -, *, /만 입력해주세요.");
        }
        this.operator=matcher.group();
    }
    public double apply(){
        switch (operator){
            case "+":
                return leftValue+rightValue;
            case "-":
                return leftValue-rightValue;

            case "*":
                return leftValue*rightValue;

            case "/":
                return leftValue/rightValue;

        }
        throw new IllegalStateException("예상치 못한 에러가 발생");
    }

//    @Override
//    public String toString(){
//
//    }
}
