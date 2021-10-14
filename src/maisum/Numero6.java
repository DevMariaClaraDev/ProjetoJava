package maisum;

import java.util.Scanner;

public class Numero6 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	int tipo;
	
	System.out.print("Digite o valor de um número inteiro: ");
	tipo = numero.nextInt();
	
	if ((tipo % 2) == 0) {
	tipo = tipo + 1;
	
	System.out.print(tipo);
	
	}else{ 
    tipo = tipo + 1;
	
	System.out.print(tipo);
	}
	
	}

}
