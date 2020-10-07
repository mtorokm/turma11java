package portugol;

import java.util.Scanner;

public class Lista1Exercicio7 {

	public static void main(String[] args) {
		/* x = ( ( (c*E) - (b*f) ) / ( (a*E) - (b*d) ) )
		   y = ( ( (a*f) - (c*d) ) / ( (a*E) - (b*d) ) )
		 * 
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int a,b,c,d,e,f;
		double x=0,y=0;
		
		System.out.print(" informe o valor de A: ");
		a = leia.nextInt();
		System.out.print(" informe o valor de B: ");
		b = leia.nextInt();
		System.out.print(" informe o valor de C: ");
		c = leia.nextInt();	
		System.out.print(" informe o valor de D: ");
		d = leia.nextInt();
		System.out.print(" informe o valor de E: ");
		e = leia.nextInt();
		
		System.out.print(" informe o valor de F: ");
		f = leia.nextInt();
		x = ( ( (c*e) - (b*f) ) / ( (a*e) - (b*d) ) );
		y = ( ( (a*f) - (c*d) ) / ( (a*e) - (b*d) ) );
		System.out.printf("\nO valor de X é :  %.2f \n", x);
		System.out.printf("\nO valor de Y é:   %.2f", y);
	
	
		leia.close();
	}

}
