package maisum;

import java.util.Scanner;

public class Numero9 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner (System.in);
	String sexo;
	float altura, peso, ideal;
	
	System.out.print("Digite feminino ou masculino para o sexo: ");
	sexo = numero.next();
	
	System.out.print("Digite a sua altura: ");
	altura = numero.nextFloat();
	
	System.out.print("Digite o seu peso: ");
	peso = numero.nextFloat();

	if (sexo.equals("feminino")) {
		System.out.println("Seu sexo �: " + sexo);
	}
	
	else {
		System.out.println("Seu sexo �: " + sexo);	
	}
	
	
	System.out.println("Sua altura �: " + altura);
	System.out.println("Seu peso �: " + peso);
	
	
	if (sexo.equals("feminino")) {
	ideal =	(62.1f * altura) - 44.7f;
	
		if (peso > ideal) 
			System.out.println("Voc� est� acima do peso ideal.");
			
		else if (peso < ideal)
			System.out.println("Voc� est� abaixo do peso ideal");
		
		else
			System.out.println("Voc� est� no peso ideal");
	}
	
	else {
	ideal = (72.7f * altura) - 58;
	
		if (peso > ideal) 
			System.out.println("Voc� est� acima do peso ideal.");
		
		else if (peso < ideal)
			System.out.println("Voc� est� abaixo do peso ideal");
	
		else
			System.out.println("Voc� est� no peso ideal");
	
	}
	
	}
	

}
