package Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {


		// 4 pessoas - nome - vetor
		// 4 nota [inteiro entre 1-10] - vetor
		// nome - nota - ate 5 > ainda não/acima de de 5 > muito bem

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String nomes[] = new String[4];
		int notas[] = new int[4];
		
		for (int x = 0; x < nomes.length; x++) {
			System.out.printf("Digite o nome %d: ", x+1);
			nomes[x] = leia.next();
			System.out.println("Digite sua nota: ");
			notas[x] = leia.nextInt();
		}
		
		for (int x = 0; x < notas.length; x ++) {
			if (notas[x] <= 5) {
				System.out.printf("%s - nota %d  - Ainda não\n", nomes[x], notas[x]);
			}
			if (notas[x] > 5) {
				System.out.printf("%s - nota %d  - Muito bem\n", nomes[x], notas[x]);
			}
		}

	}

}
