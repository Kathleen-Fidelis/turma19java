package Exemplo;

import java.util.Scanner;

public class ExpressaoMatematica {

	public static void main(String[] args) {
		
		double variavelA, variavelB, variavelC, variavelD, variavelR, variavelS;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		variavelA = leia.nextDouble();
		System.out.println("Digite o valor de B: ");
		variavelB = leia.nextDouble();
		System.out.println("Digite o valor de C: ");
		variavelC = leia.nextDouble();
		
		variavelR = (Math.pow(variavelA + variavelB, 2.0));
		variavelS = (Math.pow(variavelB + variavelC, 2.0));
		variavelD = ((variavelR + variavelS) / 2);
		
		System.out.println("O resultado da expressão é: " + variavelD);
		
	}

}
