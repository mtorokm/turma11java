package EstudandoJava;

import java.util.Scanner;

public class Lista7exercicio6 {

	public static void main(String[] args) {
		/*  Escrever um programa que receba v�rios n�meros inteiros no teclado.
		 *  E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
		 *  Para sair digitar 0(zero).
		 *  
		 *  (DO...WHILE)
		 */
			Scanner leia = new Scanner(System.in);
	int numero,quantidadeNumeros=0,somaMultiplos3=0;
		
	double mediaMultiplos3=0;
		
		do
		{
		System.out.println("Digite um n�mero, no final ser� imprimido os m�ltiplos de 3\n AVISO:digite 0 para finalizar o programa");
			numero = leia.nextInt();
			if((numero%3)==0)
			{	
				quantidadeNumeros++;
				somaMultiplos3 = somaMultiplos3 +numero;
				
			}
			
		

		}while(numero!=0);
		mediaMultiplos3 = (somaMultiplos3/quantidadeNumeros);
	    System.out.println(mediaMultiplos3); 
	
	}

}
