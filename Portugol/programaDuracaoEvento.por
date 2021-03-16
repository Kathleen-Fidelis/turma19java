programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro horas
		inteiro minutos
		inteiro segundos
		inteiro tempoSegundos

		escreva("Qual a duracao do evento em segundos?")
		leia(segundos)

		horas = (segundos / 3600)
		minutos = (segundos%(60*60) / 60)
		segundos = (segundos%(60*60)%60)

		escreva("O tempo do evento é ",horas,":",minutos,":",segundos)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */