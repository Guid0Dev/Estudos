package poo.Polimorfismo.Aula02;

public class Program {
    public static void main(String[] args){

        Cachorro c = new Cachorro();

        c.reagir("Olá");
        c.reagir(11, 45);
        c.reagir(19,00);
        c.reagir(true);
        c.reagir(2,12.5f);
    }
}
