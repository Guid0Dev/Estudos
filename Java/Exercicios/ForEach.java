package Exercicios;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for(String obj : vect){
            System.out.println(obj);
        }

        sc.close();
    }
}
