package ListaUdemy;

import java.util.Scanner;

public class EstruturaSequencial4 {

	public static void main(String[] args) {
		
		int numeroFuncionario;
		double horasTrabalhadas, valorHora, salario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu número: ");
		numeroFuncionario = leia.nextInt();
		System.out.println("Digite o número de horas trabalhadas hoje: ");
		horasTrabalhadas = leia.nextDouble();
		System.out.println("Digite o valor que recebe por hora: ");
		valorHora = leia.nextDouble();
		
		salario = (horasTrabalhadas * valorHora);
		
		System.out.println("O salário do funcionário" + numeroFuncionario + " é: " + salario);

	}

}
