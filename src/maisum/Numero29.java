package maisum;

import java.util.Scanner;

public class Numero29 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	char resposta1, resposta2, resposta3, resposta4, resposta5;
	int x = 0;
	
	System.out.print("Telefonou para a vítima? Digite  'S' para Sim ou 'N' para Não.");
	resposta1 = numero.next().charAt(0);
	
	System.out.print("Esteve no local do crime? Digite  'S' para Sim ou 'N' para Não.");
	resposta2 = numero.next().charAt(0);
	
	System.out.print("Mora perto da vítima? Digite  'S' para Sim ou 'N' para Não.");
	resposta3 = numero.next().charAt(0);
	
	System.out.print("Devia para a vítima? Digite  'S' para Sim ou 'N' para Não.");
	resposta4 = numero.next().charAt(0);
	
	System.out.print("Já trabalhou para a vítima? Digite  'S' para Sim ou 'N' para Não.");
	resposta5 = numero.next().charAt(0);
	
	if (resposta1 == 'S')
		x = x + 1;
	
	if (resposta2 == 'S')
		x = x + 1;
	
	if (resposta3 == 'S')
		x = x + 1;
	
	if (resposta4 == 'S')
		x = x + 1;
	
	if (resposta5 == 'S')
		x = x + 1;
	
	
	if (x == 1)
		System.out.print("Você não é muito suspeito.");
	
	else if (x == 2)
		System.out.print("Você é suspeito.");
	
	else if (x == 3 || x == 4)
		System.out.print("Você é cúmplice.");
	
	else if (x == 5)
		System.out.print("Você é assassino.");
	
	else 
		System.out.print("Você é inocente.");
	
	}

}
