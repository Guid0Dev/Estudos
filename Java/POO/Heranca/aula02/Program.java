package POO.Heranca.aula02;

public class Program {
    public static void main(String[] args){

        // Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();

        Aluno a1 = new Aluno();

        Professor p1 = new Professor();

        p1.setNome("Lobianco");
        p1.setIdade(45);
        p1.setSexo("M");
        
        System.out.println(p1.toString());
    }
}
