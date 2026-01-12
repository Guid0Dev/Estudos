package POO.Objetos.Aula02;

public class Aula02 {
    public static void main(String[] args){

        Caneta c1 = new Caneta();
        c1.status();

        Caneta c2 = new Caneta("Faber", "Preta", (float) 0.5, 100);
        c2.status();
    }
}
