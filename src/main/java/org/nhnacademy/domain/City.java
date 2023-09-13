package org.nhnacademy.domain;

public class City {
    private final String name;
    private String salesFigures;
    private static double totalSale = 0;
    public City(String name, String salesFigures){
        this.name = name;
        this.salesFigures=salesFigures;
        totalSale+=Double.parseDouble(salesFigures);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", salesFigures='" + salesFigures + '\'' +
                '}';
    }
    public static double getTotalSale(){
        return totalSale;
    }
}
