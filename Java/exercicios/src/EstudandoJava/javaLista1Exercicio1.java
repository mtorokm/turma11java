package EstudandoJava;

import java.util.Scanner;

public class javaLista1Exercicio1 {

	public static void main(String[] args) {
		/*Fa�a um programa que receba tres inteiros e
		 *  diga qual deles e o maior.
		 */	
		
	Scanner leia = new Scanner(System.in);
	int n1,n2,n3;
	
	System.out.print("Escreva 3 n�meros : ");
	n1 = leia.nextInt();
	n2 = leia.nextInt();
	n3 = leia.nextInt();
	
	if(n1>n3 && n1>n2) 
	{
		System.out.printf("O n�mero %d � maior q os outros 2 n�meros",n1);
	
	}
	else if(n2>n1 && n2>n1)
	{
		System.out.printf("O n�mero %d � maior q os outros 2 n�meros",n2);
	}
	else if(n3>n1 && n3>n2)
	{
		System.out.printf("O n�mero %d � maior q os outros 2 n�meros",n3);
	}
	
	else if(n1==n3 && n1==n2) 
	{
		System.out.printf("Nenhum n�mero � maior do que o outro");
	}
	
	leia.close();
	
	}

}
