package Exemplo;

import java.util.Scanner;

public class EquacoesLineares {

	public static void main(String[] args) {
		
		double a, b, c, d, e, f, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = leia.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = leia.nextDouble();
		System.out.println("Digite o valor de d: ");
		d = leia.nextDouble();
		System.out.println("Digite o valor de e: ");
		e = leia.nextDouble();
		System.out.println("Digite o valor de f: ");
		f = leia.nextDouble();
		
		x = (Math.round(c * e) - (b * f) / (a * e) - (b * d));
		y = (Math.round(a * f) - (c * a) / (a * e) - (b * d));
		
		System.out.printf("O valor de x é : %.2f O valor de y é : %.2f", x, y);
		
	}

}
