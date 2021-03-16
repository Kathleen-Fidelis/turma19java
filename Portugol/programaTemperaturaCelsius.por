programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		//variaveis
		cadeia nome 
		real temperaturaCelsius
		real temperaturaFahrenheit

		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite a temperatura em Fahrenheit: ")
		leia(temperaturaFahrenheit)
		temperaturaCelsius = Mat.arredondar( ((temperaturaFahrenheit - 32) / 1.8), 2)
		

		escreva("Olá ", nome, " a temperatura em Celsius é: ", temperaturaCelsius, "°C")

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */