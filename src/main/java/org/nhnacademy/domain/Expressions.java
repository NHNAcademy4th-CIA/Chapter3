package org.nhnacademy.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expressions {
    private final double leftValue;
    private final double rightValue;
    private final String operator;
    private final String pattern = "^[+|\\-|*|/]$";

    public Expressions(double leftValue, String operator, double rightValue){
        this.leftValue=leftValue;
        this.rightValue=rightValue;
        Matcher matcher = Pattern.compile(pattern).matcher(operator);
        if(!matcher.find()){
            throw new IllegalArgumentException("+, -, *, /만 입력해주세요.");
        }
        this.operator=matcher.group();
    }
    @Override
    public String toString(){
        return leftValue+" "+operator+" "+rightValue;
    }
}
