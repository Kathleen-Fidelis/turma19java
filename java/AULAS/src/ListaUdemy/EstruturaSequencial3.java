package ListaUdemy;

import java.util.Scanner;

public class EstruturaSequencial3 {

	public static void main(String[] args) {
		
		int A, B, C, D;
		int resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		System.out.println("Digite o valor de D: ");
		D = leia.nextInt();
		
		resultado = (A * B - C * D);
		
		System.out.println("O resultado é: " + resultado);
	}

}
