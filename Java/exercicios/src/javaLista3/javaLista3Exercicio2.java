package javaLista3;

import java.util.Scanner;

public class javaLista3Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		 *	� Os n�meros pares digitados;  
		 *	� A soma dos n�meros pares digitados; 
		 *	� Os n�meros �mpares digitados; 
		 *	� A quantidade de n�meros �mpares digitados.
		 * 
		 */
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = new int [6];
		 int x=0,somaPares=0,somaImpares=0,qntImpares=0;
		 for(x=0;x<6;x++)
		 {
			 System.out.print("Digite um n�mero : ");
			 vetor[x] = leia.nextInt();
			 
			 if((vetor[x]%2)==0)
             {
            	 somaPares = somaPares + vetor[x];
            	 
             }
			 else
			 {
				 somaImpares = somaImpares + vetor[x];
				 qntImpares++;
				 
			 }
			 
			 
			 
		 }
	
		 System.out.print(" soma dos n�meros �mpares : "+somaImpares);
		 System.out.print("\n soma dos n�meros pares : "+somaPares);
		 System.out.println("\n quantidade de n�meros �mpares : "+qntImpares);
		 
	}

}
