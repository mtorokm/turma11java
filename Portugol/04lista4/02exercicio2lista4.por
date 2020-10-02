programa
{
	inclua biblioteca Util
	
	funcao inicio()
     { /*2.      Um dado é lançado 10 vezes e o valor correspondente é anotado.
     	Faça um programa que gere um vetor com os lançamentos, 
     	escreva esse vetor.
     	A seguir *determine e imprima a média aritmética dos lançamentos, 
     	***contabilize e apresente também quantas foram as ocorrências da maior pontuação.
        */
	const inteiro LIMITE = 3
	inteiro vetorDado[LIMITE], soma = 0, maiorPontuacao = 0, mediaLanca = 0, x=0
	
	escreva("sorteando valores")
	
		para(x=0; x<LIMITE;x++){
		vetorDado[x] = Util.sorteia(1,6)
		}
		para(x=0; x<LIMITE;x++){
			escreva("\nO lançamento ",(x+1)," saiu o número ",vetorDado[x],"\n")
			soma = soma + vetorDado[x]
			se(vetorDado[x]==6){
				maiorPontuacao = maiorPontuacao + 1
				}
			
			}
	mediaLanca = soma/LIMITE
	escreva("\nA média aritmética dos lançamentos é : ",mediaLanca)
	escreva("\n\nA quantidade de vezes q a maior pontuação apareceu foi : ", maiorPontuacao)
			
			

     
    }
     
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 796; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */