package org.nhnacademy.lsj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem5 {


    private static final String regex = "^[0-9]$";
    private static final Logger logger = LoggerFactory.getLogger(Problem5.class);

    public static void problem5() throws IOException {




        String str = "";

        double answer = 0;
        int count=0;


        StringBuilder result= new StringBuilder();


        // 소괄호 안에 넣으면 알아서 close 해준다.
        try(BufferedReader bf = new BufferedReader(new FileReader("src/main/resources/test.txt"))){

            while ((str = bf.readLine()) != null) {

                for (int i = 0; i < str.length(); i++) {
                    if(str.charAt(i)>='0'&&str.charAt(i)<='9'){ // 소수점 연산 추가하기
                        result.append(str.charAt(i));
                    }
                }

                if(result.length() == 0){
                    count++;
                }else{
                    answer+=Double.parseDouble(result.toString());
                }

                result.setLength(0);
            }
        }catch (IOException e){
            logger.info(e.getMessage());
        }




        logger.info("총 합은 {}\n보고가 없는 도시 수 : {}",answer,count);


    }


}
