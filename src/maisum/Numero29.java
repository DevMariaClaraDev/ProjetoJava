package maisum;

import java.util.Scanner;

public class Numero29 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	char resposta1, resposta2, resposta3, resposta4, resposta5;
	int x = 0;
	
	System.out.print("Telefonou para a v?tima? Digite  'S' para Sim ou 'N' para N?o.");
	resposta1 = numero.next().charAt(0);
	
	System.out.print("Esteve no local do crime? Digite  'S' para Sim ou 'N' para N?o.");
	resposta2 = numero.next().charAt(0);
	
	System.out.print("Mora perto da v?tima? Digite  'S' para Sim ou 'N' para N?o.");
	resposta3 = numero.next().charAt(0);
	
	System.out.print("Devia para a v?tima? Digite  'S' para Sim ou 'N' para N?o.");
	resposta4 = numero.next().charAt(0);
	
	System.out.print("J? trabalhou para a v?tima? Digite  'S' para Sim ou 'N' para N?o.");
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
		System.out.print("Voc? n?o ? muito suspeito.");
	
	else if (x == 2)
		System.out.print("Voc? ? suspeito.");
	
	else if (x == 3 || x == 4)
		System.out.print("Voc? ? c?mplice.");
	
	else if (x == 5)
		System.out.print("Voc? ? assassino.");
	
	else 
		System.out.print("Voc? ? inocente.");
	
	}

}
