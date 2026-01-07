package Desafios.DES002;

import java.util.Scanner;

public class EX008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double imposto;
        if(x >=0 && x <= 2000){
            System.out.println("Isento");
        } else if (x >= 2000.01 && x <= 3000){

        } else if(x >= 3000.01 && x <= 4500){
 
        } else if(x > 4500){
            
        }

        sc.close();
    }
}