package portugol;

import java.util.Scanner;

public class Lista1Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		/*real x1=0
		  real x2=0
		  real y1=0
		  real y2=0
		  real resultado = 0

		  escreva("insira x1: ")
		  leia(x1)
		  escreva("insira x2: ")
		  leia(x2)
		  escreva("insira y1: ")
		  leia(y1)
		  escreva("insira y2: ")
		  leia(y2)

		  resultado = mat.raiz(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)), 2)
		  escreva("a distância entre dois pontos é:", resultado )
		 * 
		 */
		double x1=0;
		double x2=0;
	    double y1=0;
	    double y2=0;
	    double resultado = 0;
	    
	      System.out.println("insira x1: ");
		  x1 = leia.nextDouble();
		  System.out.println("insira x2: ");
		  x2 = leia.nextDouble();
		  System.out.println("insira y1: ");
		  y1 = leia.nextDouble();
		  System.out.println("insira y2: ");
		  y2 = leia.nextDouble();
		  
		  
		  resultado = Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
		  System.out.println("a distância entre dois pontos é:"+ resultado);
		

	
		  leia.close();
	
	}

}
