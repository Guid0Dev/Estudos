package POO.Exercicio.EX02;

public class Program {
    public static void main(String[] args){
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de Encapsulamento");
        v[1] = new Video("Aula 01 de Herança");
        v[2] = new Video("Aula 01 de Polimorfismo");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", 15);

        System.out.println(v[0].toString());

        Visualizacao vis[] = new Visualizacao[5];
        Visualizacao vi = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();


        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(87.0f);

    }
}
