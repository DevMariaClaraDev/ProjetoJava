package maisum;

import java.util.Scanner;

public class Numero5 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	char letra;
	
	System.out.print("Digite uma letra mai�scula, por exemplo: K.: ");
	letra = numero.next().charAt(0);
	
	if ((letra == 'A')||(letra == 'E')||(letra == 'I')||(letra == 'O')||(letra == 'U'))
	System.out.print("Esta letra � uma vogal.");
	
	else
	System.out.print("Esta letra n�o � uma vogal.");

	}

}
