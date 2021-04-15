package ListaVetoresMatrizes;

import java.util.Scanner;

public class AgendaAnoTodo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		String agenda[][][] = new String[12][31][24]; 

		int hora;
		int dia;
		int mes;
		char opcao;

		System.out.println("AGENDA");
		do {
			System.out.print("Digite o mês do compromisso: ");
			mes = leia.nextInt() - 1;
			System.out.print("Digite o dia do compromisso: ");
			dia = leia.nextInt() - 1;
			System.out.print("Digite a hora do compromisso : ");
			hora = leia.nextInt();
			leia.nextLine(); 
			System.out.print("Descreva o compromisso:");
			agenda[mes][dia][hora] = leia.nextLine();
			System.out.print("Continuar S/N: ");
			opcao = leia.next().toUpperCase().charAt(0);
			System.out.println();

		} while (opcao == 'S');

		for (int m = 0; m < 12; m++) {	
			for (int d = 0; d < 31; d++) {
				for (int h = 0; h < 24; h++) {
					if (agenda[m][d][h] != null) {
						System.out.printf("Mês: %d Dia: %d hora: %d - %s\n", m + 1, d + 1, h, agenda[m][d][h]);
						System.out.println("-------------------------------------------");
					}
				}
			}
		}
	}
}
