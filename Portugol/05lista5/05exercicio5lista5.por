programa
{
	
	funcao inicio()
	{
		/*Faça um programa que leia um vetor de 5 posições para números reais 
		 * e, depois, um código inteiro. 
		 * Se o código for zero, finalize o programa; 
		 * se for 1, mostre o vetor na ordem direta; 
		 * se for 2, mostre o vetor na ordem inversa. 
		 * Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.
		 * 
		 */
		   inteiro x,codigo
		   real vetor[5]
		   escreva("Digite 1 para mostrar o vetor digitado na ordem direta\n")
		   escreva("Digite 2 para mostrar o vetor digitado na ordem inversa\n")
		   leia(codigo)

		 
		   se (codigo>0)
		   {
		   para(x=0;x<5;x++)
		   {
		   	   escreva("Atribua os valores desejados ao vetor ")
		   	   leia(vetor[x])
			   limpa()
			   	
		   }
		   se(codigo == 1)
		   {
			escreva("O vetor na ordem direta fica : ")
		   
			   para(x=0;x<5;x++)
			   {
			   escreva(vetor[x],", ")
			   }
		   }
		  senao se(codigo == 2)
		  {
		     escreva("O vetor na ordem inversa fica : ")
		   	
		   	para(x=4;x>=0;x--)
		   	{
		   		escreva(vetor[x], ",  ")
		   	}
		   	
		   }
			
		  }
		senao se(codigo == 0)
			{
			escreva("FIM DO PROGRAMA!!!")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1190; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */