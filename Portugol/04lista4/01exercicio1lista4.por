programa
{
	
	funcao inicio()
	{
		/*Faça um programa que crie um vetor por leitura 
		 * com 5 valores de pontuação de uma atividade 
		 * e o escreva em seguida. Encontre após a maior pontuação 
		 * e a apresente.
		 */
	const inteiro LIMITE=5
	inteiro x=0
	real media=0.0, valor[LIMITE], maiorValor=0
	
	para(x=0;x<LIMITE;x++){
		escreva("\nDigite um valor : ")
		leia(valor[x])
		escreva("\nA potuação foi : ", valor[x])
		se(maiorValor<valor[x]){
		maiorValor=valor[x]
		}
	}
		escreva("\nA maior pontuação foi de: ",maiorValor)
   
   
   }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 246; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */