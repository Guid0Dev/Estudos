import java.util.*;

public class Arrays{
    public static void main(String[] args){
       
       while(true){
    
                try{
                Scanner sc = new Scanner(System.in);
                String nome;
                System.out.print("Informe seu nome: ");
                nome = sc.nextLine();

                if(!nome.matches("[a-zA-Zà-úÀ-Ú\\s]+")){
                    throw new IllegalArgumentException("Nome invalido, digite apenas letras.");
                }

                break;

                }catch(IllegalArgumentException e){
                     System.out.println("Erro: " + e.getMessage());
                }
            }
                while(true){
                    try{
                        Scanner sc =new Scanner(System.in);
                        System.out.println("Digite sua idade: ");
                       int idade = sc.nextInt();

                       if(idade <= 0 || idade > 130){
                            throw new IllegalArgumentException("Sua idade precisa estar entre 1 e 130 anos");
                       }
                       break;
                    }catch(IllegalArgumentException e){
                            System.out.println("Error: " + e.getMessage());
                    }
                }
            }
        }

