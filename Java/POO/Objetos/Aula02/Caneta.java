package POO.Objetos.Aula02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

        // construtor
    public Caneta(){

    }
    public Caneta(String m, String c, float p, int ca){
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.setCarga(ca);
        this.setTampada(tampada = true);
        this.setCor("Azul");
    }


        //getter and setter
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float ponta){
        this.ponta = ponta;
    }

    public int getCarga(){
        return this.carga;
    }
    public void setCarga(int carga){
    this.carga = carga;
    }

    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean tampada){
        this.tampada = tampada;
    }

    //metodos//

    public void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Está tampada? " + this.getTampada());
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rasbicar a caneta está tampada");
        } else {
            System.out.println("Estou rasbicando!");
        }
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
