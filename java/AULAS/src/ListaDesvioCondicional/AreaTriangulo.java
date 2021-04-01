package ListaDesvioCondicional;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		double baseTriangulo, alturaTriangulo, areaTriangulo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do triângulo: ");
		baseTriangulo = leia.nextDouble();
		
		System.out.println("Digite o valor da altura do triângulo: ");
		alturaTriangulo = leia.nextDouble();
		
		areaTriangulo = (baseTriangulo * alturaTriangulo);
		
		if (baseTriangulo >0 && ((baseTriangulo % 2) == 0)) {
			
			 if (alturaTriangulo >0 && ((alturaTriangulo % 2) == 0)) {
			}
		System.out.println("A área do triângulo é: " + areaTriangulo);
		}
		
		else {
			System.out.println("Essa operação não resulta em um número positivo e par ");
		}
		
		

	}

}
