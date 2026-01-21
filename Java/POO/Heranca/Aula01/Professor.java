package POO.Heranca.Aula01;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    //Metodos
    public void receberAum(double aumento){
        this.salario += aumento;
    }
    //Construtores

    public Professor(){

    }

    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Professor(String especialidade, double salario) {
        this.especialidade = especialidade;
        this.salario = salario;
    }

    //Metodos especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
