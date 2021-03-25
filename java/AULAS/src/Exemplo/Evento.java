package Exemplo;

import java.util.Scanner;

public class Evento {

	public static void main(String[] args) {
		
		double horas;
		double minutos;
		double segundos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a duração do evento em segundos: ");
		segundos = leia.nextDouble();
		
		horas = (segundos / 3600);
		minutos = (segundos%(60*60) / 60);
		segundos = (segundos%(60*60)%60);
		
		//System.out.println("O tempo do evento é " + horas + ":" + minutos + ":" + segundos);
		System.out.printf("Horas: %.0f Minutos: %.0f Segundos %.0f", horas, minutos, segundos);

	}

}
