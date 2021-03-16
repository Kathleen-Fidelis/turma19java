programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro idadeAnos
		inteiro idadeMeses
		inteiro idadeDias
		inteiro totalIdade

		escreva("Digite a sua idade em dias: ")
		leia(idadeDias) 
		idadeAnos = (idadeDias / 365)
		idadeMeses = (idadeDias%365 / 30)
		idadeDias = (idadeDias%365%30)
		
		escreva("A sua idade é: ", idadeAnos," ",idadeMeses," ",idadeDias)

	

		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 334; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */