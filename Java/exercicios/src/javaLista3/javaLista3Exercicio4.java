package javaLista3;

import java.util.Scanner;

public class javaLista3Exercicio4 {

	public static void main(String[] args) {
		/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
		 *(1) somar as duas matrizes 
		 *(2) subtrair a primeira matriz da segunda 
		 *(3) adicionar uma constante as duas matrizes
		 *(4) imprimir as matrizes 
		 *Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
		 *Na terceira opção o valor da constante deve ser lido e 
		 *o resultado da adição da constante deve ser armazenado na própria matriz.
		 */
			Scanner leia = new Scanner(System.in);
			double matriz1 [][] = new double [2][2];
			double matriz2 [][] = new double [2][2];
			double matriz3 [][] = new double [2][2];
			double matriz3opc2 [][] = new double [2][2];
			int opcao=0;
			double constante;
			
			for(int linha1=0;linha1<2;linha1++)
			{
				for(int coluna1=0;coluna1<2;coluna1++)
				{
					System.out.println("insira os valores da matriz1 linha "+(linha1+1)+" coluna "+(coluna1+1));
					matriz1[linha1][coluna1] = leia.nextDouble();
					
				}
			}
			for(int linha2=0;linha2<2;linha2++)
			{
				for(int coluna2=0;coluna2<2;coluna2++)
				{
					System.out.println("insira os valores da matriz2 linha "+(linha2+1)+" coluna "+(coluna2+1));
					matriz2[linha2][coluna2] = leia.nextDouble();
					
				}
				
				
			}
			
			System.out.print(" OPÇÕES\n (1) Somar as duas matrizes\n (2) Subtrair a primeira matriz da segunda\n (3) Adicionar uma constante as duas matrizes\n (4) Imprimir as matrizes");
			opcao = leia.nextInt();
			
			if(opcao == 1)
			{
				System.out.println("MATRIZ 1 + MATRIZ 2 = MATRIZ 3\n---MATRIZ 3---");
				for(int linha1=0;linha1<2;linha1++)
				{
					for(int coluna1=0;coluna1<2;coluna1++)
					{
						matriz3[linha1][coluna1] = matriz1[linha1][coluna1] + matriz2[linha1][coluna1];
						System.out.print("["+matriz3[linha1][coluna1]+"] ");
					}
					System.out.println();
				}
				
				
			}
			
			if(opcao == 2)
			{
				System.out.println("MATRIZ 1 - MATRIZ 2 = MATRIZ 3\n---MATRIZ 3---");
				for(int linha1=0;linha1<2;linha1++)
				{
					for(int coluna1=0;coluna1<2;coluna1++)
					{
						matriz3[linha1][coluna1] = matriz1[linha1][coluna1] - matriz2[linha1][coluna1];
						System.out.print("["+matriz3[linha1][coluna1]+"] ");
					}
					System.out.println();
				}
				
				
			}
			
			if(opcao == 3)
			{
				System.out.println("Insira um valor constante que você queira atribuir para a matriz");
				constante = leia.nextDouble();
				
				System.out.println("MATRIZ 1");
				
				for(int linha1=0;linha1<2;linha1++)
				{
					for(int coluna1=0;coluna1<2;coluna1++)
					{
						
						
						matriz1[linha1][coluna1] = constante;
						matriz2[linha1][coluna1] = constante;
						System.out.print("["+matriz1[linha1][coluna1]+"] ");
					}
					System.out.println();
				}
				
				System.out.println("MATRIZ 2");
				
				for(int linha1=0;linha1<2;linha1++)
				{
					
					for(int coluna1=0;coluna1<2;coluna1++)
					{
						System.out.print("["+matriz2[linha1][coluna1]+"] ");
					}
					System.out.println();
				}
				
				
				
			}
			
		if(opcao == 4)
		{
				System.out.println("MATRIZ 1");
				for(int linha1=0;linha1<2;linha1++)
				{
					
					for(int coluna1=0;coluna1<2;coluna1++)
					{
						
						System.out.print("["+matriz1[linha1][coluna1]+"] ");
						
					}
					System.out.println();
				}
				
				 System.out.println("MATRIZ2");
				for(int linha1=0;linha1<2;linha1++)
				{
					
					for(int coluna1=0;coluna1<2;coluna1++)
					{
						
						System.out.print("["+matriz2[linha1][coluna1]+"] ");
						
					}
					System.out.println();
				}

			
		}
			
	
	
   }
}


