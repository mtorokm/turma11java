programa
{
	
	funcao inicio()
	{
	 /*
	  * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos 
	  * e apresente no final o total do somatório, a média e o total de valores lidos
       *  
       *  O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo
       *  valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
	  * --o total do somatorio
	  * --a media
	  * --total de valores lidos
	  * 
	  */
	inteiro numero=1,media=0,somatorio=0,totalValoresLidos=0, contador = 0
     
	enquanto(numero>0){
			escreva("Digite um número: \n")
			leia(numero)
	
			se(numero>0){
			
			somatorio = somatorio + numero
			contador = contador + 1		
			}	
	}
			escreva(" a somatoria é 	:\n", somatorio)
			escreva(" a quantidade de números é \n", contador)
			escreva(" a média é: ", somatorio/contador)

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 866; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */