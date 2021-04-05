package ListaVetoresMatrizes;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				System.out.println("Entre com o valor da posição [" + i + "," + j + "]");
				matriz[i][j] = leia.nextInt();
			}
		}
		
		int qtdPares = 0;
		int qtdImpares = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				if (matriz[i][j] % 2 == 0) {
					qtdPares++;
				}
				else {
					qtdImpares++;
				}
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Pares: " + qtdPares);
		System.out.println("Ímpares: " + qtdImpares);
	}

}
