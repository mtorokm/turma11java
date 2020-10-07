package portugol;

import java.util.Scanner;

public class Lista1Exercicio3 {
	public static void main(String[] args) {
		/*inteiro tempoDuracao = 0
		inteiro horas = 0
		inteiro segundos = 0
		inteiro minuto = 0

		
		escreva("Digite o tempo em segundos:")
		leia(tempoDuracao)
		horas = tempoDuracao/3600
		escreva("\ntotal de horas ", horas)
		minuto= (tempoDuracao %3600)/60
		escreva("\ntotal de minutos ", minuto)
		segundos= (tempoDuracao %3600)%60
		escreva("\ntotal de segundos ", segundos)
		 * 
		 */
		
		
	Scanner leia = new Scanner (System.in);
		
		  int tempoDuracao = 0;
		  int horas = 0;
		  int segundos = 0;
		  int minuto = 0;
		  
		   System.out.print("Digite o tempo em segundos:");
			tempoDuracao = leia.nextInt();
			horas = tempoDuracao/3600;
			System.out.print("\ntotal de horas"+horas);
			minuto= (tempoDuracao %3600)/60;
			System.out.print("\ntotal de minutos "+minuto);
			segundos = (tempoDuracao %3600)%60;
			System.out.print("\ntotal de segundos "+ segundos);
		
		
		
		
		
		
		
		
	}
	
}
