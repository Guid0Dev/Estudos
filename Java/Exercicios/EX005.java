        // WHILE//

package Exercicios;
import java.util.Scanner;

public class EX005 {
    public static void main(String[] Args){
    Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int valor = 0;

        while(x != 0){
            valor +=  x;
            System.out.println("Digite um novo valor: ");
            x = sc.nextInt();
        }

        System.out.println(valor);

    sc.close();
    }
}

