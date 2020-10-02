programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	/*4. Escreva  um sistema que leia três números inteiros 
	 *e positivos (A, B, C) e calcule a seguinte expressão: 
	 * 
	 * D=(R+S)/2 onde, R= potencia(real (A+B),real 2) S=(real(B+C),real 2) 
	*/
	inteiro A=0
	inteiro B=0
	inteiro C=0
	inteiro D=0
	inteiro R=0
	inteiro S=0
	
	escreva("insira número inteiro:")
	leia(A)
	escreva("insira outro número inteiro:")
	leia(B)
	escreva("insira o último número inteiro:")
	leia(C)
	R = mat.potencia((A+B), 2)
	S = mat.potencia((B+C), 2)
	D = (R+S)/2
	escreva(D)
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 576; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */