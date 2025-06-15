import java.util.*;

public class Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num1texto, num2texto;
        int result = 0;

        while(true){
            try{
                System.out.println("Digite dois valores inteiros: ");
                num1texto = sc.nextLine();
                num2texto  = sc.nextLine();

                int num1 = Integer.parseInt(num1texto);
                int num2 = Integer.parseInt(num2texto);

                if(num2 == 0){
                    throw new ArithmeticException("Digite um número diferente de zero!");
                }

                result = num1/num2;

                System.out.println("O resultado é: " + result);
                break;

            }catch(ArithmeticException e){
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }catch(NumberFormatException e){
                System.out.println("Error: Não é permitido letras ");
                
            }finally{

            }
        }
 
    }
}