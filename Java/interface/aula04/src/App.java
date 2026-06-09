import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int option;
        GeometricForm geometricForm = null;

        while(true){
            System.out.println("Escolha a forma forma geométrica para calcular a área: ");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - circulo");
            System.out.println("4 - Sair do programa");
            option = sc.nextInt();
            if(option == 1){
                geometricForm = createSquare();
            } else if(option == 2){
                geometricForm = createRectangle();
            } else if(option == 3){
                geometricForm = createCircle();
            } else if(option == 4) {
                break;
            } else{
                System.out.println("Opção inválida");
            }
            System.out.println("O resultadodo cálculo da área foi de " + geometricForm.area());
        }
        
    }
    private static GeometricForm createSquare(){
        System.out.println("Informe os tamanhos dos lado: ");
        double side = sc.nextDouble();
        return new Square(side);
    }
    private static GeometricForm createRectangle(){
        System.out.println("Informe a base ");
        double base = sc.nextDouble();
        System.out.println("Informe a altura ");
        double heigth = sc.nextDouble();
        return new Rectangle(heigth, base);
    }
    private static GeometricForm createCircle(){
        System.out.println("Informe o raio: ");
        double radius = sc.nextDouble();
        return new Cirlce(radius);
    }
}
