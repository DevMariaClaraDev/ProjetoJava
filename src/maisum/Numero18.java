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
		System.out.println("Com estas dimens?es h? um tri?ngulo.");
	else 
		System.out.println("Com estas dimens?es n?o h? um tri?ngulo.");
		
	
	if (lado1 == lado2 && lado2 == lado3)
			System.out.println("O tri?ngulo formado ? um tri?ngulo equil?tero.");
			
	else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
			System.out.println("O tri?ngulo forado ? um tri?ngulo is?sceles.");
	
	else 
		System.out.println("O tri?ngulo forado ? um tri?ngulo escaleno.");
			
	}
	
}
