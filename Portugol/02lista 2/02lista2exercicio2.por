programa
{
	
	funcao inicio()
	{
		/*2) Elabore um sistema que leia as variáveis C e N, 
		 * respectivamente código e número de horas trabalhadas de um operário. 
		 * E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
		 * Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
		 * caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
		 * No final do processamento imprimir o salário total e o salário excedente.
		 * 
		 * calcular o salario
		 * o cara ganha 10 reais
		 * qnd numero de horas exceder 50, calcular o excedente E
		 * 
		 */
		 
	inteiro c,n,excedente,salarioTotal
	 escreva("Digite o seu código")
	 leia (c)
	 escreva("Digite a quantidade de horas q você trabalho")
	 leia(n)

		se(n<=50)
		{ excedente=0
			salarioTotal = n*10
			escreva("O salário total será de ",salarioTotal," reais")
			
		}
		senao
		{	excedente = n-50
			salarioTotal = n*10 + excedente*10
			escreva("O salário total será de ",salarioTotal,"reais")
			
		}
	
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 888; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */