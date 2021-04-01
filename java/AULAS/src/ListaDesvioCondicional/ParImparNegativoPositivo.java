package ListaDesvioCondicional;

import java.util.Scanner;

public class ParImparNegativoPositivo {

	public static void main(String[] args) {

		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá, digite um número inteiro: ");
		numero = leia.nextInt();
		
		if (numero == 0) {
			System.out.println("Zero é neutro");
		}
		
		else if (numero <0) {
			System.out.println("Esse número é negativo");
		}
		
		else if ((numero % 2) == 0) {
			System.out.println("Esse número é par");
		}
		
		else if ((numero % 2) == 1) {
			System.out.println("Esse número é ímpar");
		}
		
		else if (numero > 0) {
			System.out.println("Esse número é par");
		}
	}

}
