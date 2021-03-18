programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro numeroDigitado
		inteiro resultado
		
		escreva("Olá, digite um número: ")
		leia(numeroDigitado)

		inteiro numero = numeroDigitado
		escreva(numeroDigitado, "\n")
		
		enquanto(numero < 100) {
            numero = numero * 3
            escreva(numero, "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 249; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */