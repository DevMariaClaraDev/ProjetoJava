package maisum;

import java.util.Scanner;

import java.lang.Math;

public class Numero28 {

	public static void main(String[] args) {
	
		Scanner numero = new Scanner(System.in);
		float valor;

		System.out.print("digite o valor de um n?mero: ");
		valor = numero.nextFloat();
		
		if (valor == (int)valor)
		System.out.println("O valor ? inteiro");
		
		else 
		System.out.println("O valor ? decimal");
		
		if (Math.round(valor) % 2 == 0)
			System.out.println("Este n?mero ? par");
			
		else if (Math.round(valor) % 3 == 0 || valor == 1)
		System.out.println("Este n?mero ? ?mpar");
		
		if (valor < 0)
			System.out.println("Este n?mero ? negativo");
		
		else if (valor > 0)
			System.out.println("Este n?mero ? positivo");


	}

}
