package ListaUdemy;

import java.util.Scanner;

public class EstruturaRepetitivaFor1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int X = leia.nextInt();
		
		for (int i = 1; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
