package Exercicios;

import java.util.Locale;

public class EX001 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;


        System.out.println("Products: \n" +
        product1 + ", wich price is $ " + price1 + "\n" +
        product2 + ", wich price is $ " + price2 + "\n\n" +
        "Record: " + age + " years old, code " + code + " and gender: " + gender + "\n\n" +
        "Measue with eight decimal places: " + measure + "\n" +
        "Rouded (three decimal places): " + measure + "\n" +
        "US Decimal point: 53.235"
        );
    }
}
