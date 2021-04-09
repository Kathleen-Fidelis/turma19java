package application;

import java.util.Locale;

import entities.Doce;
import entities.Produto;
import entities.Revista;
import entities.Roupa;

public class TesteProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Produto prod1 = new Produto("CAMISA", "XL001", 100.25);
		Revista prod2 = new Revista("CLAUDIA", "RR0023", 25.50, "ABRIL");
		Roupa prod3 = new Roupa("CALÇA", "XLQ001", 90.50, "ZARA");
		Doce prod4 = new Doce("BALA", "XL002", 1.00, "7Belo");
		
		System.out.println(prod1.getDescricao() + " R$ " + prod1.getValorUnitario() + " estoque " + prod1.getQtdeEstoque());
		
		prod1.setValorUnitario(80);
		prod1.incluirEstoque(20);
		
		System.out.println(prod1.getDescricao() + " R$ " + prod1.getValorUnitario() + " estoque " + prod1.getQtdeEstoque() + " custo total " + (prod1.getQtdeEstoque() * prod1.getValorUnitario()));
		
		prod2.incluirEstoque(10);
		System.out.println(prod2.getDescricao() + " R$ " + prod2.getValorUnitario() + " editora " + prod2.getEditora() + " estoque " + prod2.getQtdeEstoque());
		
		prod3.incluirEstoque(30);
		System.out.println(prod3.getDescricao() + " R$ " + prod3.getValorUnitario() + " marca " + prod3.getMarca() +" estoque " + prod3.getQtdeEstoque());
		
		prod4.incluirEstoque(40);
		System.out.println(prod4.getDescricao() + " R$ " + prod4.getValorUnitario() + " fabricante " + prod4.getFabricantes() +" estoque " + prod4.getQtdeEstoque());
		
	}

}
