package Desafios.DES005;

import java.util.Scanner;

public class EX001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n =0;

        while(n > 10 || n <= 0){
            System.out.println("Digite um núero inteiro entre 1 e 10:");
            n = sc.nextInt();
        }

        int[] vect = new int[n];

        for(int i = 0; i < vect.length; i++){
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
