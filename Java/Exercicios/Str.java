/*formatar: toLowerCase(), toUpperCase(), trim()
  Recortar: substring(inicio), substring(inicio, fim)
  Substituir: Replace(char, char), Replace(string, string)
  Buscar: IndexOf, LastIndexOf
  str.Split("")  */ 


package Exercicios;

public class Str {
    public static void main(String[] Args){
        
        String original = "abcde FGHIJ ABC DEFG   --";

        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        String s = "Guilherme Ferreira Souza";
        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(original);
        System.out.println(original.toLowerCase());
        System.out.println(original.toUpperCase());
        System.out.println(original.trim());
        System.out.println(original.substring(2));
        System.out.println(original.substring(2, 9));
        System.out.println(original.replace('a', 'x'));
        System.out.println(i);
        System.out.println(j);
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
    
}