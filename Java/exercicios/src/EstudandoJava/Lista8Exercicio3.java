package EstudandoJava;

import java.util.Scanner;

public class Lista8Exercicio3 {

	public static void main(String[] args) {
		/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui
		 * 
		 */
		Scanner leia = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int linha=0,coluna=0,soma=0;
			for(linha=0;linha<3;linha++)
			{	
				for(coluna=0;coluna<3;coluna++)
				{
					System.out.print("Atribula valor para a matriz");
					matriz[linha][coluna] = leia.nextInt();
					if(matriz[linha][coluna]>10)
					{
						soma = soma + matriz[linha][coluna];
					}
				
		}
}
		System.out.printf("A soma de números maior de 10 é : %d",soma );
					

		}
}
