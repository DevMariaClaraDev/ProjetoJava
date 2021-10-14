package maisum;

import java.util.Scanner;

public class Numero17 {

	public static void main(String[] args) { 
	
		Scanner numero = new Scanner(System.in);
		
		float nota1, nota2;
			
			System.out.print("Digite a primeira nota: ");
			nota1 = numero.nextFloat();
			
			System.out.print("Digite a segunda nota: ");
			nota2 = numero.nextFloat();
			
			nota1 = (nota1 + nota2)/2;
			
			if (nota1 >= 9 && nota1 <=10) {
				System.out.println("Aprovado");
				System.out.println("Conceito A");
			}
			
			else if (nota1 >= 7.5f && nota1 < 9) {
				System.out.println("Aprovado");
				System.out.println("Conceito B");
			}	
			
			else if (nota1 >= 6 && nota1 < 7.5f) {
				System.out.println("Aprovado");
				System.out.println("Conceito C");
			}

			else if (nota1 >= 4 && nota1 < 6) {
				System.out.println("Reprovado");
				System.out.println("Conceito D");
			}
			
			else if (nota1 >= 0 && nota1 < 4) {
				System.out.println("Reprovado");
				System.out.println("Conceito E");
				
			}
	
	
		}
 

	}


