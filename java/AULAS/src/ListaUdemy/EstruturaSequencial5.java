package ListaUdemy;

import java.util.Scanner;

public class EstruturaSequencial5 {

	public static void main(String[] args) {
		
		int codigo1, numeroPecas1 = 0, codigo2, numeroPecas2 = 0;
		double valorUnitario1 = 0.00, valorUnitario2 = 0.00, valorPagar;
		
		Scanner leia = new Scanner(System.in);
		
		for (int i = 0; i <1; i++) {
			System.out.println("Digite o código da peça 1: ");
			codigo1 = leia.nextInt();
			System.out.println("Digite o número de peças 1: ");
			numeroPecas1 = leia.nextInt();
			System.out.println("Digite o valor unitário da peça 1: ");
			valorUnitario1 = leia.nextDouble();
			System.out.println("Digite o código da peça 2: ");
			codigo2 = leia.nextInt();
			System.out.println("Digite o número de peças 2: ");
			numeroPecas2 = leia.nextInt();
			System.out.println("Digite o valor unitário da peça 2: ");
			valorUnitario2 = leia.nextDouble();
		}
		
		valorPagar = (valorUnitario1 * numeroPecas1 + valorUnitario2 * numeroPecas2);
		
		System.out.printf("O valor a pagar será de R$: " + Math.round(valorPagar), 2);
	}

}
