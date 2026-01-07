package Desafios.DES002;

import java.util.Scanner;

public class EX005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int  x, y;
        double p, z;
        x = sc.nextInt();
        y = sc.nextInt();
        
        if(x == 1){
            p = 4;
            z = y * p;
            System.out.printf("Total: R$ %.2f%n", z);
        } else if(x == 2){
            p = 4.50;
            z = y * p;
            System.out.printf("Total: R$ %.2f%n", z);
        } else if(x == 3){
            p = 5;
            z = y * p;
            System.out.printf("Total: R$ %.2f%n", z);
        } else if(x == 4){
            p = 2;
            z = y * p;
            System.out.printf("Total: R$ %.2f%n", z);
        } else if(x == 5){
            p = 1.50;
            z = y * p;
            System.out.printf("Total: R$ %.2f%n", z);
        }

        sc.close();
    }
}