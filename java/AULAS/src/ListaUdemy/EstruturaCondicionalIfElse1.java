package ListaUdemy;

import java.util.Scanner;

public class EstruturaCondicionalIfElse1 {

	public static void main(String[] args) {
		
		double numero = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextDouble();
		
		if (numero < 0) {
			System.out.println("Esse número é negativo");
		}
		else {
			System.out.println("Esse número não é negativo");
		}
	}

}
