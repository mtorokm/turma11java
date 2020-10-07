package portugol;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String args []) {
	
	Scanner leia = new Scanner(System.in);
	/*inteiro A=0
	  inteiro B=0
	  inteiro C=0
	  inteiro D=0
	  inteiro R=0
	  inteiro S=0
	
	escreva("insira número inteiro:")
	leia(A)
	escreva("insira outro número inteiro:")
	leia(B)
	escreva("insira o último número inteiro:")
	leia(C)
	R = mat.potencia((A+B), 2)
	S = mat.potencia((B+C), 2)
	D = (R+S)/2
	escreva(D)
	 * 
	 */
	      int A=0;
		  int B=0;	
		  int C=0;
		  int D=0;
	      int R=0;
		  int S=0;
		  
		    System.out.print("insira número inteiro: ");
			A = leia.nextInt();
			System.out.print("insira outro número inteiro: ");
			B = leia.nextInt();
			System.out.println("insira o último número inteiro: ");
			C = leia.nextInt();
			
			R = (A+B)*(A+B);
			S = (B+C)*(B+C);
			D = (R+S)/2;
			  
			System.out.println(D);
	
	
	
	
	
	
	
	
	
   }
}
