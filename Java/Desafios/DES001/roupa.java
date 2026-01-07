package Desafios.DES001;

import java.util.Scanner;

public class roupa {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, num1,num2;
        double valor1, valor2, pagar;

        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        valor2 = sc.nextDouble();

        pagar = (num1 * valor1) + (num2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", pagar);
        sc.close();
    }
}
