package javaLista3;

public class javaLista3Exercicio1 {

	public static void main(String[] args) {
		/*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
		*   (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		*   (b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
		*   (c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
		*   (d) Mostre na tela cada valor do vetor A, um em cada linha.
		* 
	    */
		int A[] = {1,0,5,-2,-5,7};
		int somaP0P1P5=0,x=0;
		
		for(x=0;x<6;x++)
		{
			if(x==0 || x==1 || x==5)
			{
				somaP0P1P5=somaP0P1P5 = A[x] + somaP0P1P5;
			}
			
			if(x==4)
			{
				A[x] = 100;
				
			}
			
		}
		
	      for(x=0;x<6;x++)
	      {
	    	  System.out.println("O vetor "+ (x+1) +" � igual a : "+A[x]+"\n");
	    	  
	      }
	
	}

}
