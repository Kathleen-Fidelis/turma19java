package ListaDesvioCondicional;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		double baseTriangulo, alturaTriangulo, areaTriangulo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do tri�ngulo: ");
		baseTriangulo = leia.nextDouble();
		
		System.out.println("Digite o valor da altura do tri�ngulo: ");
		alturaTriangulo = leia.nextDouble();
		
		areaTriangulo = (baseTriangulo * alturaTriangulo);
		
		if (baseTriangulo >0 && ((baseTriangulo % 2) == 0)) {
			
			 if (alturaTriangulo >0 && ((alturaTriangulo % 2) == 0)) {
			}
		System.out.println("A �rea do tri�ngulo �: " + areaTriangulo);
		}
		
		else {
			System.out.println("Essa opera��o n�o resulta em um n�mero positivo e par ");
		}
		
		

	}

}
