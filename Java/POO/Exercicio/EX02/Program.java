package POO.Exercicio.EX02;

public class Program {
    public static void main(String[] args){
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de Encapsulamento");
        v[1] = new Video("Aula 01 de Herança");
        v[2] = new Video("Aula 01 de Polimorfismo");

        System.out.println(v[0].toString());
    }
}
