package maisum;

import java.util.Scanner;

public class Numero2 {

	public static void main(String[] args) {
		
	Scanner numero = new Scanner(System.in);
	float valor;
	
	System.out.print("Digite um n�mero:  ");
	valor = numero.nextFloat();
	
	if (valor < 0)
	System.out.print("Este valor � negativo.");
	
	else if (valor > 0)
	System.out.print("Este valor � positivo.");
	
	else
	System.out.print("Este valor � 0.");
	
	}

}
