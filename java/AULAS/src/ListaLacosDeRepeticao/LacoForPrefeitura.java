package ListaLacosDeRepeticao;

import java.util.Scanner;

public class LacoForPrefeitura {

	public static void main(String[] args) {
		
		final double HABITANTES = 3.00;
		int numeroFilhos = 0;
		int totalPessoasAte100 = 0;
		double salario=0.00;
		double mediaSalarios = 0.00;
		double totalSalarios = 0.00;
		double mediaNumeroFilhos = 0.00;
		double totalNumeroFilhos = 0.00;
		double maiorSalario = 0.00;
		double percentualPessoasAte100 = 0.00;
		
		Scanner leia = new Scanner(System.in);
		
		for (int x = 1; x <= HABITANTES; x++) {
			System.out.println("Habitantes: " + x);
			System.out.println("Digite o salário do habitante: ");
			salario = leia.nextDouble();
			System.out.println("Digite o número de filhos do habitante: ");
			numeroFilhos = leia.nextInt();
			
			totalSalarios = totalSalarios + salario;
			totalNumeroFilhos = totalNumeroFilhos + numeroFilhos;
			
			if (maiorSalario < salario) {
				maiorSalario = salario;
			}
			
			if (salario <= 100) {
				totalPessoasAte100++;
			}
		}
		
		mediaSalarios = totalSalarios / HABITANTES;
		mediaNumeroFilhos = totalNumeroFilhos / HABITANTES;
		percentualPessoasAte100 = (totalPessoasAte100 / HABITANTES) * 100.00;
		
		System.out.println("Total de salários R$: " + totalSalarios);
		System.out.printf("\nMedia de salários " + Math.round(mediaSalarios),2);
		System.out.printf("\nPercentual de pessoas que ganham até R$ 100.00: " + Math.round(percentualPessoasAte100),2);
		System.out.println("\nMaior salário R$: " + maiorSalario);
		System.out.println("Total de filhos: " + totalNumeroFilhos);
		System.out.printf("Media dos filhos " + Math.round(mediaNumeroFilhos),2);
		
		
	}

}
