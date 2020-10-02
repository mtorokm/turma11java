programa
{
	
	funcao inicio()
	{  
		/*3.  	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
        */
	const inteiro LIMITE1=4, LIMITE2=6
	inteiro n1[LIMITE1][LIMITE2]
	inteiro n2[LIMITE1][LIMITE2]
	inteiro l=0,c=0,mesmaPosicao1=0,mesmaPosicao2=0,soma=0,diferenca=0
	para(l=0;l<LIMITE1;l++){
			
			para(c=0;c<LIMITE2;c++0){
			escreva("digite o valor da linha da matriz 1 e em seguida o valor da coluna da matiz 1\n")
			leia(n1[l][c])
			     se(l==c){
					mesmaPosicao1= mesmaPosicao1 + n1[l][c]
				}
			}
		
		
		}

	para(l=0;l<LIMITE1;l++){
			para(c=0;c<LIMITE2;c++){
			escreva("digite o valor da linha da matriz 2 e em seguida o valor da coluna da matiz 2\n")
			leia(n2[l][c])	
			     se(l==c){
			     	mesmaPosicao2 = mesmaPosicao2 + n2[l][c]
			     	}
			}
	
	}
			soma = mesmaPosicao1 + mesmaPosicao2
			diferenca= mesmaPosicao1-mesmaPosicao2
			
			escreva("A matriz formada M1 é M1[",soma,"][",soma,"]\n")
			escreva("A matriz formada M2 é M2[",diferenca,"][",diferenca,"]\n")
			
			
		
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */