package maisum;

import java.util.Scanner;

public class Numero4 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	int ano;
	boolean result;
	
	System.out.print("Digite um ano que contenha 4 digitos: ");
	ano = numero.nextInt();
	
	if (result = (ano % 4) == 0)
	System.out.print("O ano digitado ? um ano bissexto.");
	
	else
	System.out.print("O ano digitado n?o ? bissexto.");
	
		
	}

}
