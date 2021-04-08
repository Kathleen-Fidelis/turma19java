package Entities;

public class Pessoa {

	//classe nome
	
	//inicio
		//atributos [�/tem/est�]
		public String nome;
		public int anoNascimento;
		public char genero;
		
		//m�todos [faz]
		public int calculaIdade() {
			return 2021 - anoNascimento; 
		}
			//sobrecarga
			public int calculaIdade(int anoAtual) {
			return anoAtual - anoNascimento;
			}
		public String tratamento() {
			String saida = "";
			if (genero == '1') {
				saida = "Sra.";
			}
			else if (genero == '2') {
				saida = "Sr.";
			}
			else if (genero == '3') {
				saida = "Sre.";
			}
			return  saida;
		}
		
		public String trasArtigo() {
			String saida = "";
			if (genero == '1') {
				saida = "A ";
			}
			else if (genero == '2') {
				saida = "O ";
			}
			else if (genero == '3') {
				saida = "E ";
			}
			return  saida;
		}
	//fim
}
