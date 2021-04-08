package Application;

import java.util.Scanner;

import Entities.ProdutoEletronico;

public class ProgramProdutoEletronico {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ProdutoEletronico produto1 = new ProdutoEletronico();
		ProdutoEletronico produto2 = new ProdutoEletronico();
		
		System.out.print("Digite o produto 1: ");
		produto1.nomeProduto = leia.next();
		System.out.print("Digite a marca: ");
		produto1.marca = leia.next();
		System.out.print("Digite o preço R$: ");
		produto1.preco = leia.nextDouble();
		
		System.out.print("Digite o produto 2: ");
		produto2.nomeProduto = leia.next();
		System.out.print("Digite a marca: ");
		produto2.marca = leia.next();
		System.out.print("Digite o preço? R$");
		produto2.preco = leia.nextDouble();
		
		System.out.printf("O produto %s da marca %s custa R$ %.2f", produto1.nomeProduto, produto1.marca, produto1.preco);
		System.out.printf("\nO produto %s da marca %s custa R$ %.2f", produto2.nomeProduto, produto2.marca, produto2.preco);

	}

}
