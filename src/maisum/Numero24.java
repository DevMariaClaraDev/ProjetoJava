package maisum;

import java.util.Scanner;

public class Numero24 {

	public static void main(String[] args) {
	
		Scanner numero = new Scanner(System.in);
		float nota1, nota2, nota3, media;
		
		System.out.print("Digite a nota 1: ");
		nota1 = numero.nextFloat();
		
		System.out.print("Digite a nota 2: ");
		nota2 = numero.nextFloat();
		
		System.out.print("Digite a nota 3: ");
		nota3 = numero.nextFloat();
		
		media = (nota1 + nota2 + nota3)/3;
		
		if (media >= 7 && media < 10)
			System.out.println(String.format("Aprovado com média: %.2f ", media));
		
		else if (media < 7)
			System.out.println(String.format("Reprovado com média: %.2f", media));
		
		else if (media == 10)
			System.out.println(String.format("Reprovado com distinção com média: %.2f", media));
		
	}

}
