package org.nhnacademy.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnglishToken {
    private EnglishToken(){

    }
//    private static final String pattern = "['s]+|[a-zA-Z]+";
private static final String pattern = "[a-zA-Z']+";

    public static List<String> split(String line){
        //        String line = "abcd1ABCas23ABBCD";
        List<String> result = new ArrayList<>();
        Matcher matcher = Pattern.compile(pattern).matcher(line);
        while (matcher.find())
        {
            result.add(matcher.group());
        }
        return result;
    }
}
