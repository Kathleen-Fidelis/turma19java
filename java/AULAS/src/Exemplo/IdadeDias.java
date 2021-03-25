package Exemplo;

import java.util.Scanner;

public class IdadeDias {

	public static void main(String[] args) {
		
		int idadeAnos;
		int idadeMeses;
		int idadeDias;
		int totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		idadeAnos = leia.nextInt();
		System.out.println("Digite quantos meses: ");
		idadeMeses = leia.nextInt();
		System.out.println("digite quantos dias: ");
		idadeDias = leia.nextInt();
		
		totalDias = (idadeAnos * 365) + (idadeMeses * 30);
		System.out.println("A sua idade em dias é: " + totalDias + idadeDias);
		

	}

}
