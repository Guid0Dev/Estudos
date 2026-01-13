package POO.Objetos.Aula03;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Conta(){
        this.status = false;
        this.saldo = 0;
    }

        //getter and setter//
    public int getNumCOnta(){
        return this.numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return this.dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }

    public Double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    
    //metodos//

    public void abrirConta(String tipo){
        this.setStatus(true);
        this.setTipo(tipo);

        if(this.tipo == "cc"){
            this.setSaldo(50.0);
        } else if(tipo == "cp"){
            this.saldo = 150;
        }
        
    }
    public void fecharConta(){
        if(this.saldo == 0 && this.status == true){
            this.status = false;
            System.out.println("Sua conta foi encerrada");
        } else {
            System.out.println("Saque todo o dinheiro ou pague os débitos da conta antes de fechar");
        }
    }
    public void depositar(Double deposito){
        if(this.status == true){
            this.saldo =+ deposito;
        } else {
        System.out.println("Abra uma conta nates de realizar um depósito.");
        }
    }
    public void sacar(Double saque){
        if (this.saldo >= saque && this.status == true){
            this.saldo -= saque;
            System.out.printf("O saque no valor de R$ %.2f foi realizado.", saque);
        } else {
            System.out.println("Você não tem o saldo necessário para realizar o saque.");
        }
    }
    public void pagarMensalidae(){
        if(this.tipo == "cc"){
            this.saldo -= 12;
        } else if(this.tipo == "cp"){
            this.saldo -= 20;
        }
    }

    public void mostrar(){
        System.out.print("NumConta: "
            + this.getNumCOnta() + "\n"
            + "Tipo: "
            + this.getTipo() + "\n"
            + "Dono: "
            + this.getDono() + "\n"
            + "Saldo: "
            + this.getSaldo() + "\n"
            + "Status: "
            + this.getStatus() + "\n"
        );
    }
}
