package maisum;

import java.util.Scanner;

public class Exerc?cio {

	public static void main(String[] args) {
	
		Scanner numero = new Scanner(System.in);
		int valor, primeiro, primeiro2, primeiro3, primeiro4, primeiro5;
		
		System.out.print("Digite um numero: ");
		valor = numero.nextInt();
		
		if (valor < 1000);
		
		primeiro = valor / 100;
		System.out.println("Quantidade de centenas ?: " + primeiro);
		
		primeiro2 = primeiro * 100;
		
		valor = valor - primeiro2;
		
		primeiro3 = valor / 10;
		System.out.println("A quantidade de dezenas ?: " + primeiro3);
		
		primeiro4 = primeiro3 * 10;
		
		primeiro5 = valor - primeiro4;
		System.out.print("A quantidade de unidades ?: " + primeiro5);
		
		}

	}


	

	


