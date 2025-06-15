import java.util.*;


public class Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        while(true){
            try{
            System.out.print("Digte seu nome completo: ");
            nome = sc.nextLine();

            if(!nome.matches("[a-zA-Z\\s]+")){
                throw new IllegalArgumentException("O nome deve conter apenas letras e espaços");
            }
            break;
            }  catch(IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
            }
        }

        while(true){
            String idadeTexto;
            
            try{
                System.out.print("Digite sua idade: ");
                idadeTexto = sc.nextLine();
                idade = Integer.parseInt(idadeTexto);

                if(idade <= 0 || idade  > 130){
                    throw new IllegalArgumentException("Sua idade deve estar entre 1 à 130 anos.");
                }

                break;

            } catch(NumberFormatException e){
                System.out.println("Error: O número precisa ser inteiro! não pode ser letras ou decimais");
            }catch(IllegalArgumentException f){
                System.out.println("Error: " + f.getMessage());
            } 
        }
    }
}