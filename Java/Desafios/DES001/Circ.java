package Desafios.DES001;

import java.util.Scanner;

public class Circ {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        double raio, pi, area;
        pi = 3.14159;
        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2);

        System.out.printf("A= %.4f%n", area);

        sc.close();
    }
}
