import java.util.ArrayList;
public class App{
    public static void main(String[] args) {

        String[] arrayEstatico = new String[5];
        arrayEstatico[0] = "Guilherme";
        arrayEstatico[1] = "Pedro";
        arrayEstatico[2] = "Edson";
        arrayEstatico[3] = "Alexandre";
        arrayEstatico[4] = "Cauã";
    
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Guilherme");
        arrayDinamico.add("Pedro");
        arrayDinamico.add("Edson");
        arrayDinamico.add("Alexandre");
        arrayDinamico.add("Cauã");

        System.out.println("Imprimindo o array estático");
        for(int indice =0; indice < arrayEstatico.length; indice++){
            System.out.println(arrayEstatico[indice]);
        }

        System.out.println("Imprimindo o array dinamico");
        for(int indice =0; indice < arrayDinamico.size(); indice++){
            System.out.println(arrayDinamico.get(indice));
        }
    }
}
