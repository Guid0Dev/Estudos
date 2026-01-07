package Desafios.DES001;

import java.util.Scanner;

public class Salario {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int id, trabalhado;
        double valorHora, salario;

        id = sc.nextInt();
        trabalhado = sc.nextInt();
        valorHora = sc.nextDouble();
        salario = trabalhado * valorHora;

        System.out.printf("NUMBER = ", id);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
