package maisum;

import java.util.Scanner;

public class Numero1 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	float maior, maior2;
	
	System.out.print("Digite um n�mero: ");
	maior = numero.nextFloat();
	
	System.out.print("Digite outro n�mero: ");
	maior2 = numero.nextFloat();
	
	if (maior2 > maior) {
		maior = maior2;
	}
	
		System.out.print(String.format("O maior n�mero �: %.2f", maior));

	}

}
