package ListaVetoresMatrizes;

import java.util.Scanner;

public class Vetor5Posicoes {

	public static void main(String[] args) {
		
		int numero[];
		int maiorNumero = 0;
		
		numero = new int[5];
		
		Scanner leia = new Scanner(System.in);
		
		for (int x=0; x<5; x++) {
			System.out.println("Digite um número: ");
			numero[x] = leia.nextInt();
		}
		
		for (int x=0; x<5; x++) {
			System.out.println("Posição: " + x + " Valor: " + numero[x]);
			
			if (maiorNumero < numero[x]) {
				maiorNumero = numero[x];
			}
		}
		
		System.out.println("O maior número é: " + maiorNumero);

	}

}
