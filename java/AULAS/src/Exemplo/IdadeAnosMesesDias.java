package Exemplo;

import java.util.Scanner;

public class IdadeAnosMesesDias {

	public static void main(String[] args) {
		
		int idadeAnos;
		int idadeMeses;
		int idadeDias;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		idadeDias = leia.nextInt();
		
		idadeAnos = (idadeDias / 365);
		idadeMeses = (idadeDias%365 / 30);
		idadeDias = (idadeDias%365%30);
		
		System.out.println("A sua idade é: " + idadeAnos + "" + idadeMeses + "" + idadeDias);
		
		

	}

}
