programa
{
	
	funcao inicio()
	{
		inteiro diasTotal = 0
		inteiro anos = 0
		inteiro meses = 0
		inteiro dias = 0

		
		escreva("Quantos dias de vida você tem? \n")
		
		leia(diasTotal)
		
		anos = diasTotal/365 
		
		meses = (diasTotal%365)/30
		
		dias = (diasTotal%365)%30)
		
		
		escreva("você tem ",anos," anos, ",meses," meses e ",dias," dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */