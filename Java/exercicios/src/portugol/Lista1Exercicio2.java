package portugol;

import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		/*inteiro diasTotal = 0
		inteiro anos = 0
		inteiro meses = 0
		inteiro dias = 0
	
		
		escreva("Quantos dias de vida você tem? \n")
		
		leia(diasTotal)
		
		anos = diasTotal/365 
		
		meses = (diasTotal%365)/30
		
		dias = (diasTotal%365)%30)
		
		
		escreva("você tem ",anos," anos, ",meses," meses e ",dias," dias")
		 * 
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int diasTotal = 0;
		int anos = 0;
		int meses = 0;
		int dias = 0;

				System.out.print("Quantos dias de vida você tem? \n");
				
				diasTotal = leia.nextInt();
				
				anos = diasTotal/365;
				
				meses = (diasTotal%365)/30;
				
				dias = (diasTotal%365)%30;
				
				//escreva("você tem ",anos," anos, ",meses," meses e ",dias," dias")
				System.out.printf("Você tem "+anos+" anos "+meses+" meses e "+dias+" dias");
		
		
		
				leia.close();
		
	}

}
