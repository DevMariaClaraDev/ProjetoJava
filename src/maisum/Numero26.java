package maisum;

import java.util.Scanner;

public class Numero26 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	int valor;
	
	System.out.print("Digite um n�mero inteiro: ");
	valor = numero.nextInt();
	
	if (valor % 2 == 0)
	System.out.println("Este n�mero � par");
	
	else if (valor % 3 == 0 || valor == 1)
	System.out.println("Este n�mero � �mpar");
	
	}

}
