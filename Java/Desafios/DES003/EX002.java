package Desafios.DES003;

import java.util.Scanner;

public class EX002 {
    public static void main(String[] Args){
    Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        
        while(x != 0 && y != 0){
        
            if(x > 0 && y > 0){
            System.out.println("primeiro");
            System.out.println("Digite duas coordenadas: ");
            x = sc.nextInt();
            y = sc.nextInt();
        } else if(x < 0 && y > 0){
            System.out.println("sugundo");
            System.out.println("Digite duas coordenadas: ");
            x = sc.nextInt();
            y = sc.nextInt();
        } else if(x < 0 && y < 0){
            System.out.println("terceiro");
            System.out.println("Digite duas coordenadas: ");
            x = sc.nextInt();
            y = sc.nextInt();
        } else if(x > 0 && y < 0){
            System.out.println("quarto");
            System.out.println("Digite duas coordenadas: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }
        
        }
    sc.close();
    }
}

            