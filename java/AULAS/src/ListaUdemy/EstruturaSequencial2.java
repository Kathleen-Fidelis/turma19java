package ListaUdemy;

import java.util.Scanner;

public class EstruturaSequencial2 {

	public static void main(String[] args) {
		
		double raio;
		double areaCirculo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite  o valor do raio do c�rculo: ");
		raio = leia.nextDouble();
		
		double pi = 3.14159;
		areaCirculo = (pi * raio * raio);
		
		System.out.printf("A �rea do c�rculo �: " + Math.round(areaCirculo), 4);

	}

}
