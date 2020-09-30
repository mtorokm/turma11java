programa
{
	
	funcao inicio()
	{
		/*
		 * 3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.

preciso de 4 variaveis
preciso de mais 4 variavris pro quadrado
variavel1 *variavel1  é o tal do quadrado 
refatoração de codigo(fazer o msm codigo com a msm ideia, so q reduzindo o codigo
(se variavel3*variavel3 for maior ou igual a 1000
senao for 
imprima valor1,valor2,valor3,valor4 e valor1*valo1, valor2*valor2,valor3*valor3,valor4*valor4
		 */
	//variaveis 
	inteiro valor1 = 0
	inteiro valor2 = 0
	inteiro valor3 = 0
	inteiro valor4 = 0
	inteiro quadrado1 = 0
	inteiro quadrado2 = 0
	inteiro quadrado3 = 0
	inteiro quadrado4 = 0
	escreva("Digite o valor 1: ")
	leia(valor1)
	escreva("Digite o valor 2: ")
	leia(valor2)
	
	escreva("Digite o valor 3: ")
	leia(valor3)
		
		escreva("Digite o valor 4: ")
		
	leia(valor4)
	//calcula 
	quadrado1=valor1*valor1
	quadrado2=valor2*valor2
	quadrado3=valor3*valor3
	quadrado4=valor4*valor4
	se ((valor3*valor3) >= 1000){
			escreva("O valor do 3 numero é", valor3, "seu quadrado é ", quadrado1)
				                                                                                                                                                 
	}
		senao{ escreva("\n", valor1, ", seu quadrado é ", quadrado1)
		escreva("\n", valor2, ", seu quadrado é ", quadrado2)
		escreva("\n", valor3, ", seu quadrado é ", quadrado3)
		escreva("\n", valor4, ", seu quadrado é ", quadrado4)
		 
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1426; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */