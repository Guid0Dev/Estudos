import java.util.Scanner;

public class vetoresE01{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int vet[];
		vet = new int[5];
		int i;
		
		System.out.println("Digite os valores do vetor: ");
		
		for( i = 0; i < 5; i++){
			
			vet[i] = sc.nextInt();
		}
		
		System.out.println("Valores na ordem inversa: ");
		
		for( i = 4; i >= 0; i--){
			
			System.out.print(vet[i] + " | ");
		}
		
		sc.close();
	}
}