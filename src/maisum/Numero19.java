package maisum;

import java.util.Scanner;

import java.lang.Math;

public class Numero19 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner (System.in);
	double a, b, c, delta, x1 = 0, x2 = 0, z = 0;
	
	System.out.print("Digite o valor de a: ");
	a = numero.nextDouble();
	
	if (a == 0)
		System.out.print("A equa??o n?o ? do segundo grau. O programa foi encerrado.");
	
	
	else {
	
	System.out.print("Digite o valor de b: ");
	b = numero.nextDouble();
	
	System.out.print("Digite o valor de c: ");
	c = numero.nextDouble();
	
	delta = ((b * b)+(-4 * a * c));
	
	if (delta < 0)
		System.out.print("A equa??o n?o possui ra?zes reais. O programa foi encerrado.");
	
	else if (delta == 0) {
		x1 = (-b + Math.sqrt(delta))/(2 * a);
		x2 = (-b - Math.sqrt(delta))/(2 * a);
		
		if (x1 % 2 == 0 || x1 % 3 == 0 || x1 ==1)
		z = x1;
		
		else if (x2 % 2 == 0 || x2 % 3 == 0 || x2 ==1)
		z = x2;
		
		System.out.print("A equa??o possui apenas uma ra?z real:" + z);
	}
		else if (delta > 0) {
			x1 = (-b + Math.sqrt(delta))/(2 * a);
			x2 = (-b - Math.sqrt(delta))/(2 * a);
			
			System.out.println("A equa??o possui duas ra?zes reais:" + x1);
			System.out.println(x2);
	}
	
	}
	

	}

}
