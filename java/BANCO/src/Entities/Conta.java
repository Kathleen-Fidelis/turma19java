package Entities;

public class Conta {

	//classe nome
	
			//inicio
				//atributos [�/tem/est�]
				public int numero;
				public String cpf;
				public double saldo;
				public boolean ativo;
				
				//construtor
				/*public Conta(int numero, String cpf ) {
					this.numero = numero;
					this.cpf = cpf;
				}*/
				
				//m�todos [faz]
				public void debito(double valor) {
					saldo -= valor;
				}
				public void credito(double valor) {
					saldo += valor;
				}
}
