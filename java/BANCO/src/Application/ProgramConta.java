package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Conta;

public class ProgramConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		//teste de usuario
		Conta contajoao = new Conta();
		
		System.out.print("Digite o n�mero da conta: ");
		contajoao.numero = leia.nextInt();
		System.out.print("Digite o cpf da conta: ");
		contajoao.cpf = leia.next();
		System.out.print("Digite o valor: ");
		double valor = leia.nextDouble();
		System.out.println("Opera��o: 1- cr�dito ou 2- d�bito?: ");
		char opcao = leia.next().charAt(0);
		
		if (opcao == '1') {
			contajoao.credito(valor);
		}
		else if (opcao == '2') {
			contajoao.debito(valor);
		}
		
		
		System.out.printf("CPF: %s \n", contajoao.cpf);
		System.out.printf("N�mero da conta: %d \n", contajoao.numero);
		System.out.printf("Saldo: %.2f \n", contajoao.saldo);
		
		//teste de programador
		/*Conta exemplo1 = new Conta(1, "111.111.111-11");
		
		exemplo1.credito(100);
		
		System.out.printf("CPF: %s \n", exemplo1.cpf);
		System.out.printf("N�mero da conta: %d \n", exemplo1.numero);
		System.out.printf("Saldo: %.2f \n", exemplo1.saldo);*/

	}

}
