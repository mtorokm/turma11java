programa
{
	
	funcao inicio()
	{
		/*
		 * Um sistema de equações lineares do tipo: (a*x)+(b*y) = c
		 * 								    (d*x)+(i*y) = f
, pode ser resolvido segundo mostrado abaixo : x = (c*i)-(b*f)/(a*i)-(b*d) y=(a*f)-(c*d)/(a*i)-(b*d)
 
Escreva um sistema que lê os coeficientes a,b,c,d,i e f e calcula e mostra os valores de x e y. 
		 */
		 
		real a = 0
		real b = 0
		real c = 0
		real d = 0
		real i = 0
		real x = 0
		real y = 0
		real f = 0
		
		escreva("coeficiente a = ")
		leia(a)
		escreva("coeficiente b = ")
		leia(b)
		escreva("coeficiente c = ")
		leia(c)
		escreva("coeficiente d = ")
		leia(d)
		escreva("coeficiente i = ")
		leia(i)
		escreva("coeficiente x = ")
		leia(x)
		escreva("coeficiente y = ")
		leia(y)
		escreva("coeficiente f = ")
		leia(f)
		

		
		c = (a*x)+(b*y)
		f = (d*x)+(i*y)
		x = (c*i)-(b*f)/(a*i)-(b*d)
		y=(a*f)-(c*d)/(a*i)-(b*d)
		escreva("O valor de x é igual a ", a, ", O valor de y é ", y)
		
		
		 
			
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */