package maisum;

import java.util.Scanner;

public class Numero15 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	int codigo;
	float preco;
	
	System.out.print("Digite o c?digo de origem do produto: ");
	codigo  = numero.nextInt();
	
	System.out.print("Digite o pre?o do produto: ");
	preco = numero.nextFloat();
	
	if (codigo == 1)
		System.out.print (String.format("Este produto ? do Sul e o seu valor ?: %.2f", preco));
	
	else if (codigo == 2)
		System.out.print (String.format("Este produto ? do Norte e o seu valor ?: %.2f", preco));

	else if (codigo == 3)
	System.out.print (String.format("Este produto ? do Leste e o seu valor ?: %.2f", preco));

	else if (codigo == 4)
	System.out.print (String.format("Este produto ? do Oeste e o seu valor ?: %.2f", preco));

	else if (codigo == 5 || codigo == 6)
	System.out.print (String.format("Este produto ? do Nordeste e o seu valor ?: %.2f", preco));
	
	else if (codigo == 7 || codigo == 8)
	System.out.print (String.format("Este produto ? do Centro Oeste e o seu valor ?: %.2f", preco));

	else
		System.out.print(String.format("Este produto ? importado e o seu pre?o ?: %.2f", preco));
	
	}

}
