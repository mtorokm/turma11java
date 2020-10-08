package EstudandoJava;

import java.util.Scanner;

public class Lista6Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/* 
           Faça um programa em que permita a entrada de um número qualquer 
           e exiba se este número é par ou ímpar. 
           Se for par exiba também a raiz quadrada do mesmo;
            se for ímpar exiba o número elevado ao quadrado.

		 * 
		 */
		
		int numero;
		double raiz;
		
		System.out.print("Digite um número : ");
		numero = leia.nextInt();
		if((numero%2)==0)
		{
			raiz = Math.sqrt(numero);
			System.out.print("Esse número é par e sua raiz quadrada é "+raiz);
			
			
		}
		else
		{
			System.out.print("Esse número é ímpar e o seu quadrado é : "+numero*numero);
			
		}
	
		leia.close();
	}

}
