package ListaUdemy;

import java.util.Scanner;

public class EstruturaCondicionalIfElse3 {

	public static void main(String[] args) {
		
		int valorA, valorB;
		int multiplos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		valorA = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		valorB = leia.nextInt();
		
		if (valorA % valorB == 0 || valorB % valorA == 0) {
			System.out.println("Esses valores são múltiplos");
		}
		else {
			System.out.println("Esses valores não são múltiplos");
		}
	}

}
