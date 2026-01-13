package POO.RelacionamentoClasses;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    // Coontrutor //

    public Lutador(){

    }

    public Lutador(String s, String n, int i,double a, double p, int v, int d, int e){
        this.setNome(s);
        this.setNacionalidade(n);
        this.setIdade(i);
        this.setAltura(a);
        this.setPeso(p);
        this.setVitorias(v);
        this.setDerrotas(d);
        this.setEmpates(e);
    }

    // Getter e Setter //

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        if(peso <52.2){
            System.out.println("Peso inválido");
        } else if(peso <= 70.3){
            this.categoria = "Leve";
        }  else if(peso <= 83.9){
            this.categoria = "Médio";
        }else if(peso <= 120.2){
            this.categoria = "Pesado";
        } else{
            System.out.println("Peso inválido");
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    // Métodos Personalizados//

    public void apresentar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("peso:" + this.getPeso());
        System.out.println("Vitorias:" + this.getVitorias());
        System.out.println("Derrotas:" + this.getDerrotas());
        System.out.println("Empate:" + this.getEmpates());
    }
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitorias:" + this.getVitorias());
        System.out.println("Derrotas:" + this.getDerrotas());
        System.out.println("Empate:" + this.getEmpates());
    }
    public void ganharLuta(){
        this.setVitorias(vitorias +1);
    }
    public void perderLuta(){
        this.setVitorias(derrotas + 1);
    }
    public void empatarLuta(){
        this.setEmpates( empates + 1);
    }


}
