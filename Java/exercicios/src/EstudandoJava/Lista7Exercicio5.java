package EstudandoJava;

import java.util.Scanner;

public class Lista7Exercicio5 {

	public static void main(String[] args) {
		/*Crie um programa que leia um n�mero do teclado 
		 *at� que encontre um n�mero igual a zero. No final,
		 *mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		Scanner leia = new Scanner(System.in);
		int numero=0, soma=0;
		
		do
		{
		   System.out.print("Digite os n�meros q vc deseja q sejam somados\nOBS:Digite 0 para efetuar a soma\n");
		   
		   numero = leia.nextInt();
		   
		   soma=soma+numero;
		   
		 
		   
		}while(numero!=0);
		
		System.out.println(soma);
		
		
		
	}

}
