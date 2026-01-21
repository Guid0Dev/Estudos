package POO.Heranca.aula02;

public class Bolsista extends Aluno{
    private double bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando a mensalidade de " + this.getNome());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagando facilitado");
    }

    public double getBolsa() {
        return bolsa;
    }
    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
