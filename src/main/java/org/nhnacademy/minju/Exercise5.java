package org.nhnacademy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise5 {
    private static final Logger logger = LoggerFactory.getLogger(Exercise5.class);

    public static void exercise5() throws FileNotFoundException {
        double totalSales = 0;
        double notAvailableCity = 0;
        char[] buffer = new char[100];
        int read;

        try (FileReader fileReader = new FileReader("src/main/resources/sales.dat")) {

            while ((read = fileReader.read(buffer)) != -1) {
                // read() : 버퍼에 파일의 데이터를 읽어 저장, 읽은 문자 개수를 리턴
                String[] strArr = new String(buffer, 0, read).split("\n");
                // char value[](source of characters), int offset(initial offset), int count(length)
                for (String str : strArr) {
                    int index = str.indexOf(":");
                    String sales = str.substring(index + 3);
                    if (sales.equals("no report received")) {
                        notAvailableCity++;
                    } else {
                        totalSales += Double.parseDouble(sales);
                    }
                }
            }
        } catch (IOException e) {
            logger.warn(e.getMessage());
        }
        logger.info("total sales from all the cities together : {}", totalSales);
        logger.info("number of cities for which data was not available : {}", notAvailableCity);
    }
}
