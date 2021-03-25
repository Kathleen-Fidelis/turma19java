package Exemplo;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		double nota1, nota2, nota3, mediaFinal, p1, p2, p3;
		
		p1 = 2;
		p2 = 3;
		p3 = 5;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextDouble();
		
		mediaFinal = (((nota1 * p1) + (nota2 * p2) + (nota3 * p3)) / (p1 + p2 + p3));
		
		System.out.println(mediaFinal);
		
	}

}
