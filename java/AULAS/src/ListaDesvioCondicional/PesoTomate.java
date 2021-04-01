package ListaDesvioCondicional;

import java.util.Scanner;

public class PesoTomate {

	public static void main(String[] args) {
		
		double P, E, M = 0.0, multaPeso;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá, quantos quilos de tomate você comprou?: ");
		P = leia.nextDouble();
		
		if (P <= 50){
			System.out.println("Você está dentro do limite. O valor da multa é R$: " + M);
		}
		
		else if (P > 50){
			E = (P - 50);
			M = 4.0;
			multaPeso = (E * M);
			
			System.out.println("Você excedeu o limite de peso, pagará uma multa no valor de R$: " + multaPeso);
		}
	}

}
	


