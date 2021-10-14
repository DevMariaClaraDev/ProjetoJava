package maisum;

import java.util.Scanner;

public class Numero14 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	int valor;
	
	System.out.print("Digite um valor de 1 a 7: ");
	valor = numero.nextInt();
	
	if (valor == 1) 
	System.out.print("Domingo");
	
	else if (valor == 2) 
	System.out.print("Segunda");
		
	else if (valor == 3) 
	System.out.print("Terça");
	
	else if (valor == 4) 
	System.out.print("Quarta");
	
	else if (valor == 5) 
	System.out.print("Quinta");
		
	else if (valor == 6) 
	System.out.print("Sexta");
	
	else if (valor == 7) 
	System.out.print("Sábado");
	
	else
	System.out.print("Valor inválido");
	
	}

}
