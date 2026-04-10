package hashCode.src;

import hashCode.entities.Client;;

public class App {
    public static void main(String[] args) {
        
        String a = "Maria";
        String b = "Maria";

        String s1 = new String("Test");
        String s2 = new String("Test");

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Client c1 = new Client("Ana", "ana@gmail.com");
        Client c2 = new Client("Pedro", "pedro@gmail.com");


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(a == b);
        System.out.println(s1 == s2);
    }
}
