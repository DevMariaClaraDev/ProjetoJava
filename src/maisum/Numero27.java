package maisum;

import java.util.Scanner;

public class Numero27 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	float valor;

	System.out.print("digite o valor de um n�mero: ");
	valor = numero.nextFloat();
	
	if (valor == (int)valor)
	System.out.print("O valor � inteiro");
	
	else 
	System.out.print("O valor � decimal");
	
	}

}
