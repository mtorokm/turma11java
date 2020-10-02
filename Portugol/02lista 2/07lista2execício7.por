programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * 7) Receber valores de base e altura de um triângulo e verificar 
		 * se são valores válidos 
		 * (positivos maiores que zero). 
		 * Em caso afirmativo, calcular a área do triângulo.
		 */
	real base = 0.0
	real altura = 0.0
	real area = 0.0

     escreva("Digite a base ")
     leia(base)
     escreva("Digite a altura ")
     leia(altura)

     se (base >0){
     	area = (base*altura)/2
     	escreva("A área do triângulo é ", mat.arredondar(area, 2))
     	
     		  }
				senao {
					escreva("dados inválidos, digite novamente")
					}
	
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 472; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */