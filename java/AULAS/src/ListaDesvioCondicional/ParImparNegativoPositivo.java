package ListaDesvioCondicional;

import java.util.Scanner;

public class ParImparNegativoPositivo {

	public static void main(String[] args) {

		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Ol�, digite um n�mero inteiro: ");
		numero = leia.nextInt();
		
		if (numero == 0) {
			System.out.println("Zero � neutro");
		}
		
		else if (numero <0) {
			System.out.println("Esse n�mero � negativo");
		}
		
		else if ((numero % 2) == 0) {
			System.out.println("Esse n�mero � par");
		}
		
		else if ((numero % 2) == 1) {
			System.out.println("Esse n�mero � �mpar");
		}
		
		else if (numero > 0) {
			System.out.println("Esse n�mero � par");
		}
	}

}
