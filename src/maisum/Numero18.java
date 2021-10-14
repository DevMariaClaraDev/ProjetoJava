package maisum;

import java.util.Scanner;

public class Numero18 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	double lado1, lado1a, lado2, lado2a, lado3, lado3a;
	
	System.out.print("Digite o valor do primeiro lado: ");
	lado1 = numero.nextDouble();
	
	System.out.print("Digite o valor do segundo lado: ");
	lado2 = numero.nextDouble();
	
	System.out.print("Digite o valor do segundo lado: ");
	lado3 = numero.nextDouble();
	
	lado1a = lado1 + lado2;
	lado2a = lado2 + lado3;
	lado3a = lado1 + lado3;
	
	
	if (lado1a > lado3 || lado2a > lado1 || lado3a > lado2 )
		System.out.println("Com estas dimensões há um triângulo.");
	else 
		System.out.println("Com estas dimensões não há um triângulo.");
		
	
	if (lado1 == lado2 && lado2 == lado3)
			System.out.println("O triângulo formado é um triângulo equilátero.");
			
	else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
			System.out.println("O triângulo forado é um triângulo isósceles.");
	
	else 
		System.out.println("O triângulo forado é um triângulo escaleno.");
			
	}
	
}
