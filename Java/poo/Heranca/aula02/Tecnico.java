package poo.Heranca.aula02;

public final class Tecnico extends Aluno{
    private String registroProfisional;

    public final void praticar(){
        System.out.println("Está praticando");
    }

    public String getRegistroProfisional() {
        return registroProfisional;
    }

    public void setRegistroProfisional(String registroProfisional) {
        this.registroProfisional = registroProfisional;
    }
}
