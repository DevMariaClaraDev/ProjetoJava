package maisum;

import java.util.Scanner;

public class Numero16 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	
float nota1, nota2;
	
	System.out.print("Digite a primeira nota: ");
	nota1 = numero.nextFloat();
	
	System.out.print("Digite a segunda nota: ");
	nota2 = numero.nextFloat();
	
	nota1 = (nota1 + nota2)/2;
	
	if (nota1 >= 0 && nota1 <=3)
		System.out.print("Reprovado");
	
	else if (nota1 > 3 && nota1 <= 6.9f)
		System.out.print("Em exame");
	
	else
		System.out.print("Aprovado");
	


	}

}
