programa
{
	
	funcao inicio()
	{
		//variavis
		real P = 0.0//(peso de tomates)
		real E //(excesso)
		real M = 0.0//(valor da multa)
		real multaPeso


		escreva("Olá, quantos kilos de tomate você comprou?: ")
		leia(P)

		se (P <= 50) {
			escreva("Você está dentro do limite. O valor da multa é R$: ", M) 
		}

		senao se (P > 50) {
		E = (P - 50)
		M = 4.0
		multaPeso = (E * M)
			
			escreva("Você excedeu o limite de peso, pagará uma multa no valor de R$: ", multaPeso)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */