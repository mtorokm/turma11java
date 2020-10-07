programa
{
	
	funcao inicio()
	{
	  /*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
	   * a média e o total de valores lidos. 
	   * O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
	   * Ou seja, o programa deve parar quando o usuário fornecer um valor negativo
	   * 
	   */
	real numero=0.0,somatorio=0.0,media
	inteiro totalLido = 0
	enquanto(numero>=0){
	
	escreva("Digite um número")
	leia(numero)
	se(numero<0)	
	{
		limpa()
		
				media=(somatorio/totalLido)
		escreva("O somatório é igual a : ",somatorio)
		escreva("\nA média é igual a : ",media)
		escreva("\nO total de números digitados foi : ",totalLido)	
		escreva("\nFIM DO PROGRAMA")
	}
	
	somatorio = somatorio + numero
	totalLido = totalLido + 1
	
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 761; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */