programa
{
	
	funcao inicio()
	{
		inteiro soma = 0
		inteiro x

		escreva("Os números múltiplos de 3 da contagem de 1 a 500: ")

		para (x=1; x<=500; x++) {
			se (x%3 == 0){
				se (x%2!=0){
				soma  = soma + x

				escreva(x, " , ")
			}
		}
	}
	escreva ("\nSoma dos números múltiplos de 3 é: ", soma)
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 310; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */