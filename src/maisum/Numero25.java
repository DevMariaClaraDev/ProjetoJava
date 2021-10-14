package maisum;

import java.util.Scanner;

public class Numero25 {

	public static void main(String[] args) {
	
	Scanner numero = new Scanner(System.in);
	int valor, outro = 0, cem = 0, cinquenta = 0, dez = 0, muda = 0, muda1 = 0, tira = 0, tira1 = 0, puxa = 0, puxa1 = 0, teto = 0, teto1 = 0, fita = 0;
	
	System.out.print("Digite o valor que você deseja sacar entre 10 e 600 reais: ");
	valor = numero.nextInt();
	
	if (valor >= 100 && valor <= 600) {
		muda = valor/100;
		muda1 = muda * 100;
		valor = valor - muda1;
		outro = muda;
	}	
		
	if (valor >= 50 && valor < 100) {
		tira = valor/50;
		tira1 = tira * 50;
		valor = valor - tira1;
		cem = tira;
	}
	
	if (valor >= 10 && valor < 50){
		puxa = valor/10;
		puxa1 = puxa * 10;
		valor = valor - puxa1;
		cinquenta = puxa;
	}
	
	if (valor >= 5 && valor < 10){
		teto = valor/5;
		teto1 = teto * 5;
		valor = valor - teto1;
		dez = teto;
	}
	
	if (valor >= 1 && valor < 5){
		fita = valor;
	}
	
	System.out.println("Serão fornecidas a quantidade de notas de 100 reais, 50 reais, 10 reais e 1 real respectivamente:");
	System.out.println(outro);
	System.out.println(cem);
	System.out.println(cinquenta);
	System.out.println(dez);
	System.out.println(fita);
	
	}

}
