package ListaLacosDeRepeticao2;

import java.util.Scanner;

public class LacoDoWhileNumeroZero {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0, soma = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			soma += numero;
		}
		while (numero != 0);
			System.out.printf("A soma de todos os n�meros digitados �: %d", soma);
	}

}
