package maisum;

import java.util.Scanner;

public class Numero15 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	int codigo;
	float preco;
	
	System.out.print("Digite o código de origem do produto: ");
	codigo  = numero.nextInt();
	
	System.out.print("Digite o preço do produto: ");
	preco = numero.nextFloat();
	
	if (codigo == 1)
		System.out.print (String.format("Este produto é do Sul e o seu valor é: %.2f", preco));
	
	else if (codigo == 2)
		System.out.print (String.format("Este produto é do Norte e o seu valor é: %.2f", preco));

	else if (codigo == 3)
	System.out.print (String.format("Este produto é do Leste e o seu valor é: %.2f", preco));

	else if (codigo == 4)
	System.out.print (String.format("Este produto é do Oeste e o seu valor é: %.2f", preco));

	else if (codigo == 5 || codigo == 6)
	System.out.print (String.format("Este produto é do Nordeste e o seu valor é: %.2f", preco));
	
	else if (codigo == 7 || codigo == 8)
	System.out.print (String.format("Este produto é do Centro Oeste e o seu valor é: %.2f", preco));

	else
		System.out.print(String.format("Este produto é importado e o seu preço é: %.2f", preco));
	
	}

}
