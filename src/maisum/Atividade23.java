package maisum;

import java.util.Scanner;

public class Atividade23 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	int idade1, idade2, idade3, media;
	
	System.out.print("Digite a idade do aluno 1: ");
	idade1 = numero.nextInt();
	
	System.out.print("Digite a idade do aluno 2: ");
	idade2 = numero.nextInt();
	
	System.out.print("Digite a idade do aluno 3: ");
	idade3 = numero.nextInt();
	
	media = (idade1 + idade2 + idade3)/3;
	
	if (media < 25)
		System.out.println("Turma jovem");
	
	else if (media >= 25 && media <= 40)
		System.out.println("Turma adulta");
	
	else
		System.out.println("Turma idosa");
	
	}

}
