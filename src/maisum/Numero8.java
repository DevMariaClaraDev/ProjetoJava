package maisum;

import java.util.Scanner;

public class Numero8 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner (System.in);
	float nota1, nota2;
	
	System.out.print("Digite a primeira nota: ");
	nota1 = numero.nextFloat();
	
	System.out.print("Digite a segunda nota: ");
	nota2 = numero.nextFloat();
	
	nota1 = (nota1 + nota2)/2;
	
	if (nota1 >= 7)
		System.out.print("Aprovado");
	else
		System.out.print("Reprovado");
	

	}

}
