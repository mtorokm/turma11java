package DesafioEcommerce;

import java.util.Scanner;

public class BlocoUsuario {

	public static void main(String[] args) {
		/*solicitar o nome 
		 * var nomeIn
		 * Do While
		 * solicitar o sexo
		 * var sexoIn
		 * OPC
		 * homem H || mulher M || outros O
		 * 
		 * correto saia do laço de repetição
		 */
		
	Scanner leia = new Scanner(System.in);
	
	String nomeIn;
	char sexoIn;
	
	
	System.out.print("Digite o seu nome : ");
	nomeIn = leia.next();
	
	System.out.println(nomeIn);
	do
	{
		System.out.print("Digite o seu sexo : H-homem, M-mulher, O-outros ");
		sexoIn = leia.next().toUpperCase().charAt(0);
		
	}while (sexoIn != 'H' && sexoIn != 'M' && sexoIn != 'O');
	
	leia.close();
	
	
	}
	
	
}		