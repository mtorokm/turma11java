programa
{
	
	funcao inicio()
	{
		/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
		 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
		 * ou seja, diagonal principal.
		 */
	 const inteiro LIMITELINHA=3, LIMITECOLUNA=3
	 real valor[LIMITELINHA][LIMITECOLUNA],soma=0.0,somaDiagonal=0.0
	 inteiro l=0,c=0
	  para(l=0;l<LIMITELINHA;l++){
	  		
			para(c=0;c<LIMITECOLUNA;c++){
				escreva("Digite o valor da linha e em seguida digite o valor da coluna: \n")
				leia(valor[l][c])
				soma=valor[l][c] + soma
				se(l==c){
					somaDiagonal=somaDiagonal + valor[l][c]
				}
			
			
			}
	
	  	}
			escreva("\nA soma da matriz é  :",soma)
			escreva("\nA soma da diagonal é : ",somaDiagonal)
	 
	 
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