package maisum;

import java.util.Scanner;

public class Numero7 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner (System.in);
	float valor1, valor2, valor3;
	
	System.out.print("Digite o primeiro valor: ");
	valor1 = numero.nextFloat(); 
	
	System.out.print("Digite o segundo valor: ");
	valor2 = numero.nextFloat();
	
	System.out.print("Digite o terceiro valor: ");
	valor3 = numero.nextFloat();
	
	if (valor1 > valor2 && valor2 > valor3) {
	System.out.println(String.format("Os valores são: %.2f", valor1));
	System.out.println(String.format("%.2f", valor2));
	System.out.print(String.format("%.2f", valor3));
	}
	
	else if (valor1 > valor3 && valor3 > valor2) {
	System.out.println(String.format("Os valores são: %.2f ", valor1));
	System.out.println(String.format("%.2f", valor3));
	System.out.print(String.format("%.2f", valor2));
	}	
	
	else if (valor2 > valor1 && valor1 > valor3) {
	System.out.println(String.format("Os valores são: %.2f ", valor2));
	System.out.println(String.format("%.2f", valor1));
	System.out.print(String.format("%.2f", valor3));
	}
	
	else if (valor2 > valor3 && valor3 > valor1) {
	System.out.println(String.format("Os valores são: %.2f ", valor2));
	System.out.println(String.format("%.2f", valor3));
	System.out.print(String.format("%.2f", valor1));
	}
	
	else if (valor3 > valor1 && valor1 > valor2) {
	System.out.println(String.format("Os valores são: %.2f ", valor3));
	System.out.println(String.format("%.2f", valor1));
	System.out.print(String.format("%.2f", valor2));
	}	
	
	else if (valor3 > valor2 && valor2 > valor1) {
	System.out.println(String.format("Os valores são: %.2f ", valor3));
	System.out.println(String.format("%.2f", valor2));
	System.out.print(String.format("%.2f", valor1));
	}
			
	}

}
