package Desafios.DES001;

import java.util.Scanner;

public class Var {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        x = sc.nextInt();
        y = sc.nextInt();
        soma = x + y;

        System.out.println("SOMA = " + soma);


        sc.close();
    }
    
}
