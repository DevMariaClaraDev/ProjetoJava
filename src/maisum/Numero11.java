package maisum;

import java.util.Scanner;

public class Numero11 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	String turno;
	
	System.out.print("Digite o turno no qual você estuda sendo ele matutino, vespertino ou noturno: ");
	turno = numero.nextLine();
	
	if (turno.equals("matutino"))
		System.out.print("Bom Dia!");
	
	else if (turno.equals("vespertino"))
		System.out.print("Boa Tarde!");
	
	else
		System.out.print("Boa Noite!");
	
	

	}

}
