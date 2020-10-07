programa
{
	
	funcao inicio()
	{
		/*Faça um programa que calcula e escreve a seguinte soma: 
		 * soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
		 */
	
	inteiro divisor,dividendo
	real soma=0.0
	
		para(inteiro i=0;i<=50;i++)
		{
			divisor = i+1
			dividendo = i+2
			soma = 1 + dividendo/divisor + soma
		}
	escreva("a soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50 é igual  a",soma)
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */