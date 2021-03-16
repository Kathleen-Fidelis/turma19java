programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//variaveis
		cadeia nome 
		real temperaturaCelsius
		real TemperaturaFahrenheit

		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite a temperatura em graus Celsius: ")
		leia(temperaturaCelsius)
		TemperaturaFahrenheit = ((temperaturaCelsius * 1.8) + 32)
		

		escreva("Olá ", nome, " a temperatura em Fahrenheit é: ", TemperaturaFahrenheit, "°F")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 150; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */