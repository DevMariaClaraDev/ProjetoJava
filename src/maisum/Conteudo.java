package maisum;

import java.util.Scanner;

public class Conteudo {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		int TAM;
		
		System.out.print("Digite um valor: ");
		TAM = numero.nextInt();
		
		System.out.println("Pares");
		for (int i = 0; i <= TAM; i++) {
			if(i % 2 == 0)
				System.out.print(i + "|");
			
			
		}
		
		System.out.println("\nPares");
		for (int i = 0; i <= TAM; i++) {
			if(i % 2 != 0)
				System.out.print(i + "|");
			
			
		}
		
		
	}
	
}
			
		

	


