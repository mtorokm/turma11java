package portugol;

import java.util.Scanner;

public class Lista1Exercicio1 {

	/*inteiro anos, meses, dias, idadeEmDias = 0
		escreva("Informe a sua idade")
		escreva("\nAnos: ")
		leia(anos)
		escreva("\nMeses: ")
		leia(meses)
		escreva("\nDias: ")
		leia(dias)
		idadeEmDias = (anos * 365) + (meses * 30) + dias
		escreva("A sua idade em dias é " + idadeEmDias + " dias.")
	 * 
	 */
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int anos,meses,dias;
		int totalDias;
		
		System.out.print("informe sua idade");
		System.out.print("\nanos: ");
		anos = leia.nextInt();
		System.out.print("\nmeses");
		meses = leia.nextInt();
		System.out.print("\ndias");
		dias = leia.nextInt();	
		totalDias = (anos * 365) + (meses * 30) + dias;
		System.out.println("A sua idade em dias é "+ totalDias +" dias.");
		
		leia.close();
	
	}

}
