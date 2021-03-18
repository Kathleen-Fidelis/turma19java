programa
{
	
	funcao inicio()
	{
		//variaveis
		real C  //(código)
		real N = 0.0 //(múmero de horas trabalhadas)
		real salario  //(10,00 por hora)
		real excesso = 0.0
		real excessoHoras = 0.0
		inteiro codigo = 123

		escreva("Olá, digite seu código de acesso: ")
		leia(codigo)
		
		se (codigo == 123) {
			escreva("Olá, quantas horas você trabalhou hoje?: ")
		leia(N)	
		}

		se (N <= 50) {
		N = (N * 10.00)
			escreva("Você está dentro do limite de horas, seu salário será de: ", N)
		}
			
		senao se (N > 50) {
		
		N = (N * 10.00)
		excessoHoras = ((N - 50) * 20.00)
			
			escreva("Você ultrapassou o limite de horas, o salário excedente será de: ", excessoHoras)
		}
		limpa()

		escreva("O salário total é de R$: ", N, " e o salário excedente é de R$ ", excessoHoras)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 783; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {excessoHoras, 11, 7, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */