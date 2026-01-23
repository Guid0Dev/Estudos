package Exercicios;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List <String> list =new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        list.remove("Anna");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        for(String x : list){
            System.out.println(x + " " + x.indexOf(x));
        } 

        sc.close();
    }
}
