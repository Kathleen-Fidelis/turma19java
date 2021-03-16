programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//variaveis
		real variavelA
		real variavelB
		real variavelC   
		real variavelD
		real variavelR
		real variavelS

		escreva("Digite o valor de A: ")
		leia(variavelA)
		escreva("Digite o valor de B: ")
		leia(variavelB)
		escreva("Digite o valor de C: ")
		leia(variavelC)	

		variavelR = Matematica.potencia(variavelA + variavelB, 2)
		variavelS = Matematica.potencia(variavelB + variavelC, 2)
		variavelD = ((variavelR + variavelS) / 2)

		escreva("O resultado da expressao é: ", variavelD)
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */