package ListaDesvioCondicional;

import java.util.Scanner;

public class PesoTomate {

	public static void main(String[] args) {
		
		double P, E, M = 0.0, multaPeso;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Ol�, quantos quilos de tomate voc� comprou?: ");
		P = leia.nextDouble();
		
		if (P <= 50){
			System.out.println("Voc� est� dentro do limite. O valor da multa � R$: " + M);
		}
		
		else if (P > 50){
			E = (P - 50);
			M = 4.0;
			multaPeso = (E * M);
			
			System.out.println("Voc� excedeu o limite de peso, pagar� uma multa no valor de R$: " + multaPeso);
		}
	}

}
	


