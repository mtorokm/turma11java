package EstudandoJava;

import java.util.Scanner;

public class Lista6Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/* 
           Fa�a um programa em que permita a entrada de um n�mero qualquer 
           e exiba se este n�mero � par ou �mpar. 
           Se for par exiba tamb�m a raiz quadrada do mesmo;
            se for �mpar exiba o n�mero elevado ao quadrado.

		 * 
		 */
		
		int numero;
		double raiz;
		
		System.out.print("Digite um n�mero : ");
		numero = leia.nextInt();
		if((numero%2)==0)
		{
			raiz = Math.sqrt(numero);
			System.out.print("Esse n�mero � par e sua raiz quadrada � "+raiz);
			
			
		}
		else
		{
			System.out.print("Esse n�mero � �mpar e o seu quadrado � : "+numero*numero);
			
		}
	
		leia.close();
	}

}
