programa
{
	
	funcao inicio()
	{
		/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor 
		 * e dos impostos (aplicados ao custo de fábrica). 
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%
		 * carro novo= somaCustoFabrica + porcentagem distribuidor
		 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
		 */
	inteiro custoFabrica, carroNovo
	escreva("Digite o custo de fábrica")
	leia(custoFabrica)
	carroNovo = ((custoFabrica*28)/100) + ((custoFabrica*45)/100) + custoFabrica
	escreva("O preço total a ser pago pelo carro novo é de", carroNovo)
	
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 670; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */