package ListaVetoresMatrizes;

import java.util.Scanner;

public class MatrizDiagonalPrincipal {

	public static void main(String[] args) {
		
		int matriz[][];
		int diagonalPrincipal  = 0, numero;
		
		matriz = new int[3][3];
		
		Scanner leia = new Scanner(System.in);
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				numero = (int)(Math.random()*9)+1;
				matriz[linha][coluna] = numero;
				if (linha == coluna) {
					diagonalPrincipal = diagonalPrincipal + matriz[linha][coluna];
				}
			}
			
		}
		
		System.out.println("Forma de matrix");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print(matriz[linha] [coluna]);
			}
			System.out.println();
		}
	System.out.println("Valor da diagonal principal: " + diagonalPrincipal);
	}

}
