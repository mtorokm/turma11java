package portugol;

import java.util.Scanner;

public class Lista1Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in); 
		
		/*real nota1=0
		  real nota2=0
		  real nota3=0
		  real media=0
		 
		  escreva("digite a nota da primeira avaliação")
		  leia(nota1)
		  leia(nota2)
		  leia(nota3)
		  media=((nota1*2)+(nota2*3)+(nota3*5))/3
		 
		
		  escreva("sua média é: ", media) 
		 * 
		 */
		   
		   double nota1=0;
		   double nota2=0;
		   double nota3=0;
		   double media=0;
		   
		    System.out.print("digite a nota da primeira avaliação ");
			 nota1 = leia.nextDouble();
			 nota2 = leia.nextDouble();
			 nota3 = leia.nextDouble();
			 media=((nota1*2)+(nota2*3)+(nota3*5))/3;
			 
			 System.out.print("sua média é: "+media);
		   
	
	
	
	
	
	}

}
