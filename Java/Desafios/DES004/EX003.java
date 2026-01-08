package Desafios.DES004;

import java.util.Scanner;

public class EX003 {
    public static void main(String[] Args){
    Scanner sc = new Scanner(System.in);


        double y = 0;
        int z = 0;
        int x = sc.nextInt();

        while(z != 3){
            for(int i = 1; i < x; i++){
            y = sc.nextDouble();
            z +=1;
        }

        }
        System.out.println("FIm");

    sc.close();
    }
}
