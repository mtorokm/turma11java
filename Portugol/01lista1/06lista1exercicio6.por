programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*6. Construa um programa em c que, tendo como dados de entrada dois pontos 
		 * quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
		 * A fórmula que efetua tal cálculo é: real mat.raiz(mat.potencia((X2-X1), 2) + mat.potencia((Y2-Y1)), 2), 2)
		 */
		real x1=0
		real x2=0
		real y1=0
		real y2=0
		real resultado = 0

		escreva("insira x1: ")
		leia(x1)
		escreva("insira x2: ")
		leia(x2)
		escreva("insira y1: ")
		leia(y1)
		escreva("insira y2: ")
		leia(y2)

		resultado = mat.raiz(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)), 2)
		escreva("a distância entre dois pontos é:", resultado )  
	 
	
	
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 684; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */