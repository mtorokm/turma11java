programa
{
	
	funcao inicio()
	{
		/*Escrever um programa que leia uma quantidade desconhecida de números 
		 * e conte quantos deles estão nos seguintes intervalos: 
		 * [0-25], [26-50], [51-75] e [76-100]. 
		 * A entrada de dados deve terminar quando for lido um número negativo.
		 */
	   
	   inteiro numero,x=0,quantidade1=0,quantidade2,quantidade3,quantidade4
	   escreva("Digite  um número : ")
	   leia(numero)
	   
	         se(numero>=0 e numero<=25)
	         {
	         	escreva("Números do 0 ao 25 : ",numero)
	   	
	         }
              senao se(numero>=26 e numero<=50)
	         {
	         	          quantidade1 = numero - 25 
		      		escreva("números do 0 ao 25 : 25")
	        		     pulalinha()
	   		          escreva("números do 26 ao 50 : ", quantidade1)
	 	          
	   
	         }
	         senao se(numero>=51 e numero<=75){
	                   quantidade2 = numero-50
	   	              {
	   		           escreva("números do 0 ao 25 : 25")
	   		           pulalinha()
	   		           escreva("números do 26 ao 50 : 25")
	   		           pulalinha()
	   		           escreva("números do 51 ao 75 :", quantidade2)
	                   }

	         senao se(numero>=75 e numero<=100)
	   		         {
	   		   	      quantidade3 = numero-75
	   		   	      escreva("números do 0 ao 25   : 25")
	   		           pulalinha()
	   		           escreva("números do 26 ao 50  : 25")
	   		           pulalinha()
	   		           escreva("números do 51 ao 75  : 25")
	   		           pulalinha()
	   		           escreva("números do 75 ao 100 : ",quantidade3)

	   		         }
	   	    se(numero<0)
	   	    {
	   	    	escreva("FIM DO PROGRAMA!")
	   	    }
	   		senao se(numero>100)
	   		{
	   			
	   		   	      escreva("números do 0 ao 25   : 25")
	   		           pulalinha()
	   		           escreva("números do 26 ao 50  : 25")
	   		           pulalinha()
	   		           escreva("números do 51 ao 75  : 25")
	   		           pulalinha()
	   		           escreva("números do 75 ao 100 : 25")
	   		}
	
	
	      }
         
         
         
               funcao pulalinha()
	         {
		      escreva("\n")
	         }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1401; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */