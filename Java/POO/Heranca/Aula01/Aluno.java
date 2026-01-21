package POO.Heranca.Aula01;

public class Aluno extends Pessoa{
    private int matr;
    private String curso;

    //Metodos
    public void cancelarMatr(){
        System.err.println("matricula será cancelada.");
    }


    //construtor
    public Aluno(){
        
    }
    public Aluno(int matr, String curso) {
        this.matr = matr;
        this.curso = curso;
    }

    //Metodos especiais
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
