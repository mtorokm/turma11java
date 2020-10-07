programa
{
	
	funcao inicio()
	{
		/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
		 * coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
           *  a) média do salário da população; 
           *  b) média do número de filhos; 
           *  c) maior salário; 
           *  d) percentual de pessoas com salário até R$100,00.  
		 */
			inteiro const LIMITE=20
			inteiro filhos,mediaFilhos,hab=LIMITE,somaFilhos=0,salario100=0
			real salarios,mediaSalario,maiorSalario = 0.0 ,percentual100,somaSalarios=0.0
			para(hab=0;hab<LIMITE;hab++)
			{
				escreva("Digite a quantidade de filhos : ")
				leia(filhos)
				escreva("Digite o seu salário : ")
				leia(salarios)
				somaFilhos = filhos + somaFilhos
				somaSalarios= salarios + somaSalarios
				se(salarios<=100)
				{
					salario100 = salario100 + 1
				
				}
				se(salarios>maiorSalario)
				{
					maiorSalario = salarios
					
				}

					
			}
			
			mediaSalario = somaSalarios/hab
			mediaFilhos = somaFilhos/hab
			percentual100 = salario100*5
			escreva("a porcentagem de pessoas com um salário de até 100 reais é de : ",percentual100,"%")
			pulalinha()
			escreva("A média dos salários é de : ", mediaSalario," reais por habitantes")
			pulalinha()
			escreva("A média de filhos de de :",mediaFilhos," filhos por habitantes")
			pulalinha()
			escreva("O maior salário é de :",maiorSalario" reais")
			pulalinha()
			

	}
		funcao pulalinha()
		{
			escreva("\n")
		}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */