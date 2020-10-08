package EstudandoJava;

import java.util.Scanner;

public class Lista7Exercicio2 {

	public static void main(String[] args) {
		/*Ler 10 números e imprimir quantos 
		 * são pares e quantos são ímpares. 
		 * (FOR)
		 */
		Scanner leia = new Scanner(System.in);
		 
		int numero,contador = 0,pares=0,impares=0;
		
		for(contador=1;contador<=10;contador++)
		{
			System.out.print("Digite um número: ");
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
		System.out.printf("Quantidade de números pares   : %d \nQuantidade de números ímpares : %d",pares,impares);
		
		
	}
	
	
	
}


