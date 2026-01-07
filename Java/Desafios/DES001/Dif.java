package Desafios.DES001;

import java.util.Scanner;

public class Dif {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, DIFERENCA;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);

        sc.close();
    }
}
