package ListaLacosDeRepeticao2;

import java.util.Scanner;

public class LacoWhileCaracteristicasPsicologicas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroPessoas = 0, idade = 0, sexo = 0, opcoes = 0;
		int totalPessoasCalmas = 0;
		int totalMulheresNervosas = 0;
		int totalHomensAgressivos = 0;
		int totalOutrosCalmos = 0;
		int totalPessoasNervosasMais40 = 0;
		int totalPessoasCalmasMenos18 = 0;
		final int LIMITE = 5;
		
		while (numeroPessoas <= LIMITE) {
			System.out.print("Olá, digite sua idade: ");
			idade = leia.nextInt();
			System.out.print("Digite seu sexo 1- Feminino 2- Masculino 3- Outros: ");
			sexo = leia.nextInt();
			System.out.println("Escolha a opção em que você se encaixa 1- Calma 2- Nervosa 3- Agressiva: ");
			opcoes = leia.nextInt();
			
			numeroPessoas++;
			
			if (opcoes == 1) {
				totalPessoasCalmas ++;
			}
			if (sexo == 1 && opcoes == 2) {
				totalMulheresNervosas ++;
			}
			if (sexo == 2 && opcoes == 3) {
				totalHomensAgressivos ++;
			}
			if (sexo == 3 && opcoes == 1) {
				totalOutrosCalmos ++;
			}
			if (idade >= 40 && opcoes == 2) {
				totalPessoasNervosasMais40 ++;
			}
			if (idade < 18 && opcoes == 1) {
				totalPessoasCalmasMenos18 ++;
			}
		}
		
		System.out.println("Pessoas calmas: " + totalPessoasCalmas);
		System.out.println("Mulheres nervosas: " + totalMulheresNervosas);
		System.out.println("Homens agressivos: " + totalHomensAgressivos);
		System.out.println("Outros calmos: " + totalOutrosCalmos);
		System.out.println("Nervosos com mais de 40: " + totalPessoasNervosasMais40);
		System.out.println("Calmos com menos de 18: " + totalPessoasCalmasMenos18);

	}

}
