programa
{
	inclua biblioteca Matematica
		funcao inicio()
	{
		//variaveis
		real x1
		real x2
		real y1
		real y2
		real distancia
		real potenciaX
		real potenciaY

		escreva("Digite o valor de x1: ")
		leia(x1)
		escreva("Digite o valor de x2: ")
		leia(x2)
		escreva("Digite o valor de y1: ")
		leia(y1)
		escreva("Digite o valor de y2: ")
		leia(y2)

		potenciaX = (Matematica.potencia((x2 - x1), 2.0))
		potenciaY = (Matematica.potencia((y2 - y1), 2.0))

		escreva("D = ", (Matematica.raiz((potenciaX + potenciaY), 2.0))	
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 537; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */