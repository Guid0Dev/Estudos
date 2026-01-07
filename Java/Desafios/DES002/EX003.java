package Desafios.DES002;

import java.util.Scanner;

public class EX003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x%y == 0 || y%x == 0){
            System.out.println("São multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        sc.close();
    }
}