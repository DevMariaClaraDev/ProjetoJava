package maisum;

import java.util.Scanner;

public class Numero3 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	char sexo;
	
	System.out.print("Digite F para feminino ou M para masculino: ");
	sexo = numero.next().charAt(0);
	
	if (sexo == 'F')
	System.out.print("O sexo é feminino.");
	
	else
	System.out.print("O sexo é masculino.");

	}

}
