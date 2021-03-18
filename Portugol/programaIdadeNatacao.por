programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro idade

		escreva("Olá, qual a sua idade?: ")
		leia(idade)

		se (idade <5 ){
			escreva("Desculpe, mas com essa idade não é permitido fazer as aulas de natação. ")
		}

		senao se (idade >= 5 e idade <8){
			escreva("Você pertence a categoria Infantil A ")
		}

		senao se (idade >=8 e idade <12){
			escreva("Você pertence a categoria Infantil B ")
		}

		senao se (idade >=12 e idade <14){
			escreva("Você pertence a categoria Juvenil A ")
		}

		senao se (idade >=14 e idade <18){
			escreva("Você pertence a categoria Juvenil B ")
		}

		senao se (idade >=18){
			escreva("Você pertence a categoria Adultos ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 665; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */