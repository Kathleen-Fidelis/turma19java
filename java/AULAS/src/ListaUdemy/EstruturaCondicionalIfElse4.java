package ListaUdemy;

import java.util.Scanner;

public class EstruturaCondicionalIfElse4 {

	public static void main(String[] args) {
		
		double horaInicio, horaFim, duracao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o horário de início do jogo: ");
		horaInicio = leia.nextDouble();
		System.out.println("Digite o horário de término do jogo: ");
		horaFim = leia.nextDouble();
		
		if (horaInicio < horaFim) {
			duracao = horaFim - horaInicio;
		}
		else {
			duracao = 24 - horaInicio + horaFim;
		}
	
		System.out.println("O jogo durou " + duracao + " hora(s)");
	}

}
