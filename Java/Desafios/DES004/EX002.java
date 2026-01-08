package Desafios.DES004;

import java.util.Scanner;

public class EX002 {
    public static void main(String[] Args){
    Scanner sc = new Scanner(System.in);

        int y = 0;
        int out = 0;
        int in = 0;
        int x = sc.nextInt();

        for(int i = 1; i <= x; i++){
            y = sc.nextInt();
            if(y>= 10 && y <= 20){
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

    sc.close();
    }
}
