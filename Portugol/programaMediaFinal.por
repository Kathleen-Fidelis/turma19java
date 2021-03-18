programa
{
	
	funcao inicio()
	{
		//variaveis
		real nota1
		real nota2
		real nota3
		real mediaFinal
		real p1
		real p2
		real p3

		p1 = 2
		p2 = 3
		p3 = 5

		escreva("Digite a nota 1: ")
		leia(nota1)
		escreva("Digite a nota 2: ")
		leia(nota2)
		escreva("Digite a nota 3: ")
		leia(nota3)

		mediaFinal = (((nota1 * p1) + (nota2 * p2) + (nota3 * p3)) / (p1 + p2 + p3))

		escreva("A média final deste aluno é: ", mediaFinal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */