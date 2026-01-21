package POO.Exercicio.EX02;

public class Gafanhoto extends Pessoa {
    private int login;
    private Double totAssistido;

    public void viuMaisUm(){
        this.totAssistido ++;
    }

    public Gafanhoto(){

    }
    public Gafanhoto(int login) {
        this.login = login;
        this.totAssistido = 0.0;
    }

    public Gafanhoto(String nome, int idade, String sexo, int login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0.0;
    }

    //metodos especiais//
    public int getLogin() {
        return login;
    }
    public void setLogin(int login) {
        this.login = login;
    }

    public Double getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(Double totAssistido) {
        this.totAssistido = totAssistido;
    }


    @Override
    public void ganharExp(){
        this.experiencia ++;
    }
}
