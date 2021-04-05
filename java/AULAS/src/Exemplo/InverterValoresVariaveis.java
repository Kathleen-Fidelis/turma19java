package Exemplo;

import java.util.Scanner;

public class InverterValoresVariaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, novoValorA, novoValorB;
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de b: ");
		b = leia.nextInt();
		
		novoValorA = b;
		novoValorB = a;
		
		System.out.println(novoValorA);
		System.out.println(novoValorB);
		
		/*Somente com duas variáveis
		 *  a = a + b; a = 10 + 20 a = 30
		 * b = a - b; b = 30 - 20 b = 10
		 * a = a -b; a = 30 - 10 a = 20
		 */
		
	}

}
