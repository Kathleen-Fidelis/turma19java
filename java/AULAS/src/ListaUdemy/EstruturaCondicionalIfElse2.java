package ListaUdemy;

import java.util.Scanner;

public class EstruturaCondicionalIfElse2 {

	public static void main(String[] args) {
		
		double numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		numero = leia.nextDouble();
		
		if (numero %2 == 0) {
			System.out.println("Esse n�mero � par");
		}
		else {
			System.out.println("Esse n�mero � �mpar");
		}
	}

}
