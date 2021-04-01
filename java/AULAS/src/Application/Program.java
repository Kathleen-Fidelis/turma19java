package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Enter rectangle width and height: ");
		rectangle.width = leia.nextDouble();
		rectangle.height = leia.nextDouble();
		
		System.out.println(rectangle.toString());
	}
}
