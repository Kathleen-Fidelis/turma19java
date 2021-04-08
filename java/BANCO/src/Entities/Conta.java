package Entities;

public class Conta {

	//classe nome
	
			//inicio
				//atributos [é/tem/está]
				public int numero;
				public String cpf;
				public double saldo;
				public boolean ativo;
				
				//construtor
				/*public Conta(int numero, String cpf ) {
					this.numero = numero;
					this.cpf = cpf;
				}*/
				
				//métodos [faz]
				public void debito(double valor) {
					saldo -= valor;
				}
				public void credito(double valor) {
					saldo += valor;
				}
}
