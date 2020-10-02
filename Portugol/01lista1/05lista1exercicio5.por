programa
{
	
	funcao inicio()
	{
		/*5. Faça um sistema que leia as 3 notas de um aluno e calcule 
		 * a média final deste aluno. Considerar que a média é ponderada 
		 * e que o peso das notas é: 2,3 e 5, respectivamente
		 * nota= (A*2)+(B*3)+(C*5)/3
		 */
		 real nota1=0
		 real nota2=0
		 real nota3=0
		 real media=0
		 
		 escreva("digite a nota da primeira avaliação")
		 leia(nota1)
		 leia(nota2)
		 leia(nota3)
		 media=((nota1*2)+(nota2*3)+(nota3*5))/3
		 
		
		 escreva("sua média é: ", media) 
		 
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */