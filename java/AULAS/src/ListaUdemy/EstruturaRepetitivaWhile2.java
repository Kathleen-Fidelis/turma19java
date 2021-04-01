package ListaUdemy;

import java.util.Scanner;

public class EstruturaRepetitivaWhile2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int X = leia.nextInt(), Y = leia.nextInt();
		
		while (X != 0 && Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("Pertence ao primeiro quadrante");
			}
			else if (X < 0 && Y > 0) {
				System.out.println("Pertence ao segundo quadrante");
			}
			else if (X < 0 && Y < 0) {
				System.out.println("Pertence ao terceiro quadrante");
			}
			else {
				System.out.println("Pertence ao quarto quadrante");
			}
			X = leia.nextInt();
			Y = leia.nextInt();
		}

	}

}
