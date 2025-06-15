import java.util.Scanner;
import java.util.InputMismatchException;

public class Exer01_Tratamento{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int numero;

        while(true){
            try{
                System.out.println("Digite um número inteiro: ");
                numero = sc.nextInt();

                break;

            }catch(InputMismatchException e){
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }
    }
}
