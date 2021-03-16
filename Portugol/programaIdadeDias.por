programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro idadeAnos
		inteiro idadeMeses
		inteiro idadeDias
		inteiro totalDias

		escreva("Digite a sua idade: ")
		leia(idadeAnos) 
		escreva("Digite quantos meses: ")
		leia(idadeMeses)
		escreva("Digite quantos dias: ")
		leia(idadeDias)
		
		totalDias = (idadeAnos * 365) + (idadeMeses * 30)
		escreva(" A sua idade em dias é: ", totalDias + idadeDias)

	

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 167; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */