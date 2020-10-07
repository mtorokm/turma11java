programa
{
	
	funcao inicio()
	{
		/*
		2- Desenvolver um sistema que efetue a soma de todos os números ímpares 
		que são  múltiplos de três e que se encontram
		no conjunto dos números de 1 até 500
		*/
	
	inteiro totalImpar = 0
	
	
	para(inteiro numero=3;numero<=500;numero++){
	
	 se( numero%2==1 e numero%3==0) {
	 	
	 			totalImpar = totalImpar + numero 
	 }
	                                       }
	 escreva("o total da soma de ímpares múltiplos de 3 é : ", totalImpar)
			}
	
	
         
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */