package org.nhnacademy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem5 {


    private static final String regex = "^[0-9]$";
    private static final Logger logger = LoggerFactory.getLogger(Problem5.class);

    public static void problem5() throws IOException {


        BufferedReader bf = new BufferedReader(new FileReader("src/main/resources/test.txt"));


        String str = "";

        double answer = 0;
        int count=0;

        while ((str = bf.readLine()) != null) {
            StringBuilder result= new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                    result.append(str.charAt(i));
                }
            }

            if(result.length() == 0){
                count++;
            }else{
                answer+=Double.parseDouble(result.toString());
            }
        }

        logger.info("총 합은 {}\n보고가 없는 도시 수 : {}",answer,count);


    }


}
