package EstudandoJava;

import java.util.Scanner;

public class Lista7Exercicio2 {

	public static void main(String[] args) {
		/*Ler 10 n�meros e imprimir quantos 
		 * s�o pares e quantos s�o �mpares. 
		 * (FOR)
		 */
		Scanner leia = new Scanner(System.in);
		 
		int numero,contador = 0,pares=0,impares=0;
		
		for(contador=1;contador<=10;contador++)
		{
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			if((numero%2)==0)
			{
				pares++;
			}
			else 
			{
				impares++;
			
			
			}
		}
		System.out.printf("Quantidade de n�meros pares   : %d \nQuantidade de n�meros �mpares : %d",pares,impares);
		
		
	}
	
	
	
}


