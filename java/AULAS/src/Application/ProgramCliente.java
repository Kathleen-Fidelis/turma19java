package Application;

import java.util.Scanner;

import Entities.Cliente;

public class ProgramCliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente();
		
		System.out.println("Nome do cliente: ");
		cliente1.nome = leia.next();
		System.out.println("CPF do cliente: ");
		cliente1.cpf = leia.next();
		System.out.println("Qual sua idade: ");
		cliente1.idade = leia.nextInt();
		System.out.println("Digite seu e-mail: ");
		cliente1.email = leia.next();
		System.out.println("Forma de pagamento 1- Cartão de crédito / 2- Cartão de débito / 3- Dinheiro: ");
		cliente1.formaPagamento = leia.next().charAt(0);
		
		
		System.out.printf("Dados do cliente: \n %s\n %s\n %d\n %s\n %s", cliente1.nome, cliente1.cpf, cliente1.idade, cliente1.email, cliente1.pagamento());

	}

}
