package POO.Exercicio.EX01;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "\n Titulo = " + titulo + "\n autor = " + autor + "\n totPaginas = " + totPaginas + "\n pagAtual = " + pagAtual
                + "\n aberto = " + aberto + "\n leitor = " + leitor + "]";
    }

    //construtores//
    public Livro(){
        this.pagAtual =0;
        this.aberto = false;
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual =0;
        this.aberto = false;
    }


        //Métodos especiais //
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual(){
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // Metodos abstratos//
    @Override
    public void abrir(){
        this.aberto = true;
    }
    @Override
    public void fechar(){
        this.aberto = false;
    }
    @Override
    public void folhear(int p){
        this.pagAtual = p;
    }

    @Override
    public void avancarPag(){
        this.pagAtual ++;
    }

    @Override
    public void voltarPag(){
        this.pagAtual --;
    }
}
