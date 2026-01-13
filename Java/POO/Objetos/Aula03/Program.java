package POO.Objetos.Aula03;

public class Program {
    public static void main(String[] args){

        Conta c1 = new Conta();

        c1.setNumConta(1111);
        c1.setDono("Jubileu");
        c1.abrirConta("cc");

        Conta c2 = new Conta();
        c2.setNumConta(2222);
        c2.setDono("Creusa");
        c2.abrirConta("cp");

        c1.depositar(100.00);
        c2.depositar(500.00);
        c2.sacar(50.00);

        c1.mostrar();
        c2.mostrar();
    }
}
