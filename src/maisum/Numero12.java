package maisum;

import java.util.Scanner;

public class Numero12 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	float salario, aumento = 0, resultado = 0;
	
	System.out.print("Informe o seu salário: ");
	salario = numero.nextFloat();
	
	if (salario <= 280) {
	aumento = (salario/100) * 20;
	resultado = salario + aumento;
	System.out.println("O percentual aplicado foi: 20%");
	}
	
		else if (salario >= 281 && salario <= 700) {
		aumento = (salario/100) * 15;
		resultado = salario + aumento;
		System.out.println("O percentual aplicado foi: 15%");
		}
	
		else if (salario >= 701 && salario <= 1500) {
		aumento = (salario/100) * 10;
		resultado = salario + aumento;
		System.out.println("O percentual aplicado foi: 10%");
		}
		
		else if (salario >= 1501) {
		aumento = (salario/100) * 5;
		resultado = salario + aumento;
		System.out.println("O percentual aplicado foi: 5%");
		}
			
	System.out.println(String.format("O salário antes do reajuste era: %.2f", salario ));
	System.out.println(String.format("O valor de aumento foi: %.2f", aumento ));
	System.out.println(String.format("O novo salário é: %.2f", resultado ));
	

	}

}
