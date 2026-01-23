package Desafios.DES005;

import java.util.Scanner;

public class EX002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.print("VALORES = ");

        for(int i =0; i < vect.length; i++){
            System.out.print(vect[i] + " ");
        }
        int soma = 0;
        for(int i = 0; i<vect.length; i++){
            soma += vect[i];
        }
        System.out.print("\nSoma: " + soma);

        System.out.println("\nMedia: " + soma/vect.length);

        sc.close();
    }
}