programa
{
	inclua biblioteca Util
	
	//inteiro numero = 0
	cadeia cpf = ""
	real saldo = 0.00
	real saldoMovimento 
	logico ativa = verdadeiro
	
	funcao inicio()
	{
		
		caracter codigo
		cadeia tipo
		
		faca{
			limpa()
			escreva("Nome do banco\n")
			escreva("Slogan\n")
	
			escreva("Olá, selecione o tipo de conta: \n1-Conta Poupança\n2-Conta Corrente\n3-Conta Especial\n4-Conta Empresa\n5-Conta Estudantil\n6-Sair\n")
			escreva("Digite o código da opção selecionada: ")
			leia(codigo)

			se (codigo == '1'){
				caracter diaAniversarioPoupanca
				caracter auxDebitoCredito
				caracter auxDia
				caracter auxSair
				tipo = "POUPANÇA"
				cabecalho(tipo)
				escreva("Digite o dia do aniversário: ")
				leia(diaAniversarioPoupanca)
				para (inteiro x=1; x<=10; x++){
					escreva("\nMovimento : ", x)
					escreva("\nSaldo atual: ", saldo)
					escreva("\nD - Débito ou C - Crédito: ")
					leia(auxDebitoCredito)
					escreva("Valor do movimento: ")
					leia(saldoMovimento)
					se (auxDebitoCredito == 'D' ou auxDebitoCredito == 'd' ){
						enquanto (saldoMovimento > saldo){
							escreva("Valor acima do permitido, tente novamente!\n")
							escreva("Saldo atual: ", saldo, "\n")
							escreva("Digite novamente o valor para Débito: ")
							leia(saldoMovimento)
						}
						saldo = saldo - saldoMovimento
					}senao se (auxDebitoCredito == 'C' ou auxDebitoCredito == 'c'){
						saldo = saldo + saldoMovimento
					}
					escreva("Continua S/N: ")
					leia(auxSair)
					se (auxSair == 'N' ou auxSair == 'n'){
						pare
					}
				}
				escreva("Qual o dia de hoje?: ")
				leia(auxDia)
				se (auxDia == diaAniversarioPoupanca){
					saldo = (saldo*0.05) + saldo
				}
				escreva("\nCPF: ", cpf)
				escreva("\nAtiva: ", ativa)
				escreva("\nDia de aniversário: ",diaAniversarioPoupanca)
				escreva("\nSaldo: ", saldo)
				Util.aguarde(4000)
			}
			senao se (codigo == '2'){
				tipo = "CORRENTE"
				cabecalho(tipo)
				Util.aguarde(2000)
			}
			senao se (codigo == '3'){
				tipo = "ESPECIAL"
				cabecalho(tipo)
				Util.aguarde(2000)
			}
			senao se (codigo == '4'){
				tipo = "EMPRESA"
				cabecalho(tipo)
				Util.aguarde(2000)
			}
			senao se (codigo == '5'){
				tipo = "ESTUDANTIL"
				cabecalho(tipo)
				Util.aguarde(2000)
			}
			senao se (codigo == '6'){
				escreva("Você escolheu Sair\n")
				Util.aguarde(2000)
				pare
			}
			senao{
				escreva("Você não escolheu um número entre 1 e 6")
				Util.aguarde(2000)
			}
			
		}enquanto (codigo != '6')
			escreva("Fim de programa, volte sempre!!")
		}

		funcao cabecalho(cadeia tipo){
			caracter aux
			limpa()
			escreva("Nome do banco\n")
			escreva("Slogan\n")
			escreva("\n")
			escreva("CONTA ",tipo,"\n")
			escreva("CPF: ")
			leia(cpf)
			escreva("1 - Ativo ou 2 - Inativo: ")
			leia(aux)
			se (aux == '1'){
				ativa = verdadeiro
			}
			senao{
				ativa = falso
			}
		}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 186; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */