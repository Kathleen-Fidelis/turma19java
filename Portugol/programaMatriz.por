programa
{
	
	funcao inicio()
	{
		cadeia  agenda[24][31]
		inteiro dia, hora
		
		escreva("Digite o dia do compromisso: ")
		leia(dia)
		escreva("Digite a hora: ")
		leia(hora)
		escreva("Informe o compromisso: ")
		leia(agenda[hora][dia])
		limpa()
		escreva("Agenda dia ", dia, " as ",hora, " ")
		escreva(agenda[hora][dia])

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */