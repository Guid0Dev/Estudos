        // Condição ternária //

package Exercicios;
import java.util.Scanner;

public class EX004 {
    public static void main(String[] Args){
    Scanner sc = new Scanner(System.in);

    double preco = 34.5;
    double desconto  = (preco < 20.0)? preco * 0.1 : preco * 0.05;


    if(preco < 20.0){
        desconto = preco * 0.1;
    } else {
        desconto = preco * 0.005;
    }
    }
}
