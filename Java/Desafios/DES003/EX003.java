package Desafios.DES003;

import java.util.Scanner;

public class EX003 {
    public static void main(String[] Args){
    Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();

        while(x != 4){
            switch(x){
                case 1:
                    System.out.println("Alcool: 1");
                    break;
                case 2:
                    System.out.println("Gasolina: 2");
                    break;
                case 3:
                    System.out.println("Diesel: 3");
                    break;
                default:
                    System.out.println("Ecolha entre 1, 2, 3 ou 4: ");
                    break;
            }
            x= sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        
    sc.close();
    }
}
