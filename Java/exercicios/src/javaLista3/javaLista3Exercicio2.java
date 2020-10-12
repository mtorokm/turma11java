package javaLista3;

import java.util.Scanner;

public class javaLista3Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2- Faça um programa que receba 6 números inteiros e mostre: 
		 *	• Os números pares digitados;  
		 *	• A soma dos números pares digitados; 
		 *	• Os números ímpares digitados; 
		 *	• A quantidade de números ímpares digitados.
		 * 
		 */
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = new int [6];
		 int x=0,somaPares=0,somaImpares=0,qntImpares=0;
		 for(x=0;x<6;x++)
		 {
			 System.out.print("Digite um número : ");
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
	
		 System.out.print(" soma dos números ímpares : "+somaImpares);
		 System.out.print("\n soma dos números pares : "+somaPares);
		 System.out.println("\n quantidade de números ímpares : "+qntImpares);
		 
	}

}
