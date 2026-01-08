package Desafios.DES003;

import java.util.Scanner;

public class EX003 {
    public static void main(String[] Args){
    Scanner sc = new Scanner(System.in);

        int x, id1, id2, id3;
        x = sc.nextInt();
        id1 = 0;
        id2 = 0;
        id3 = 0;

        while(x != 4){
            switch(x){
                case 1:
                    id1 += 1;
                    System.out.printf("Alcool: %s%n", id1);
                    break;
                case 2:
                    id2 += 1;
                    System.out.printf("Gasolina: %s%n", id2);
                    break;
                case 3:
                    id3 += 1;
                    System.out.printf("Diesel: %s%n", id3);
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
