programa
{
	
	funcao inicio()
	{
		//variavies
		real a
		real b
		real c
		real d
		real e1
		real f
		real x
		real y

		escreva("Digite o valor de a: ")
		leia(a)
		escreva("Digite o valor de b: ")
		leia(b)
		escreva("Digite o valor de c: ")
		leia(c)
		escreva("Digite o valor de d: ")
		leia(d)
		escreva("Digite o valor de e: ")
		leia(e1)
		escreva("Digite o valor de f: ")
		leia(f)

		x = ((c * e1) - (b * f) / (a * e1) - (b * d))
		y = ((a * f) - (c * a) / (a * e1) - (b * d))

		 escreva("O valor de x é: ", x, " e o valor de y é: ", y)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 530; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */