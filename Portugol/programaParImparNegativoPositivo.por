programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro numero

		escreva("Olá, digite um número inteiro: ")
		leia(numero)

		
		se (numero == 0){
			escreva("Zero é neutro")
		}

		senao se (numero < 0) {
			escreva("Esse número é negativo")
		}
		
		
		senao se ((numero % 2) == 0){
			escreva("Esse número é par")
		}
		
		senao se ((numero % 2) == 1) {
			escreva("Esse número é ímpar")
		}
		
		senao se (numero > 0) {
			escreva("Esse número é positivo")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */