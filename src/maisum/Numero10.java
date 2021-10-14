package maisum;

import java.util.Scanner;

public class Numero10 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	float valor1, valor2, valor3;
	
	System.out.print("Digite o primeiro número: ");
	valor1 = numero.nextFloat();
	
	System.out.print("Digite o segundo número: ");
	valor2 = numero.nextFloat();
	
	System.out.print("Digite o terceiro número: ");
	valor3 = numero.nextFloat();
	
	if (valor1 > valor2 && valor2 > valor3) {
		System.out.println(String.format("O maior valor é: %.2f", valor1));
		System.out.println(String.format("O menor valor é: %.2f", valor3));
		}
		
		else if (valor1 > valor3 && valor3 > valor2) {
		System.out.println(String.format("O maior valor é: %.2f ", valor1));
		System.out.println(String.format("O menor valor é: %.2f", valor2));
		}	
		
		else if (valor2 > valor1 && valor1 > valor3) {
		System.out.println(String.format("O maior valor é: %.2f ", valor2));
		System.out.println(String.format("O menor valor é: %.2f", valor3));
		}
		
		else if (valor2 > valor3 && valor3 > valor1) {
		System.out.println(String.format("O maior valor é: %.2f ", valor2));
		System.out.println(String.format("O menor valor é: %.2f", valor1));
		}
		
		else if (valor3 > valor1 && valor1 > valor2) {
		System.out.println(String.format("O maior valor é: %.2f ", valor3));
		System.out.println(String.format("O menor valor é: %.2f", valor2));
		}	
		
		else if (valor3 > valor2 && valor2 > valor1) {
		System.out.println(String.format("O maior valor é: %.2f ", valor3));
		System.out.println(String.format("O menor valor é: %.2f", valor1));
		}
				


	}

}
