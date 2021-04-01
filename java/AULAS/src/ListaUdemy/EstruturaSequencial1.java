package ListaUdemy;

import java.util.Scanner;

public class EstruturaSequencial1 {

	public static void main(String[] args) {
		
		int valor1 = 0;
		int valor2 = 0;
		int soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor 1: ");
		valor1 = leia.nextInt();
		System.out.println("Digite o valor 2: ");
		valor2 = leia.nextInt();
		
		soma = valor1 + valor2;
		System.out.println("O resultado da soma é: " + soma);
	}

}
