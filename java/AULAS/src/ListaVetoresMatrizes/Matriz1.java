package ListaVetoresMatrizes;

import java.util.Random;

public class Matriz1 {

	public static void main(String[] args) {
	
		int maiorL5 = 0;
		int menorL5 = 10;
		int maiorC7 =0;
		int menorC7 = 10;
		
		int matriz[][] = new int[10][10];
		
		Random numeroRandom = new Random();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = numeroRandom.nextInt(9);
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < matriz[5].length; i++) {
			if (matriz[5][i] > maiorL5) {
					maiorL5 = matriz[5][i];
			}
			if (matriz[5][i] < menorL5) {
				menorL5 = matriz[5][i];
			}
		}
		
		System.out.println("Maior valor da linha 5: " + maiorL5);
		System.out.println("Menor valor da linha 5: " + menorL5);
		
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][7] > maiorC7) {
					maiorC7 = matriz[i][7];
			}
			if (matriz[i][7] < menorC7) {
				menorC7 = matriz[i][7];
			}
		}
		
		System.out.println("Maior valor da coluna 7: " + maiorC7);
		System.out.println("Menor valor da coluna 7: " + menorC7);
		
		
		
		
		
		
		
	}

}
