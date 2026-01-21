package POO.Polimorfismo.Aula01;

public class Ave extends Animal{
    private String corPena;


    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Fazer ninho");
    }

    public void contruirNinho(){
        System.out.println("Contruindo ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
