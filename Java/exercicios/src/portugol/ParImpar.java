package portugol;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		/*programa
{
	
	funcao inicio()
	{
		inteiro valorUsuario
		escreva("Digite um valor: ")
		leia(valorUsuario)
		se (valorUsuario > 0) {
			se ((valorUsuario % 2) == 0) {
				escreva("O valor é positivo e par")	
			}
			senao {
				escreva("O valor é positivo e ímpar")
			}
		}
		senao se (valorUsuario <0) {
			se ((valorUsuario % 2) == 0) {
			escreva("O valor é negativo e par")
			}
			senao {
				escreva("O valor é negativo e ímpar")
			}
		}
		senao {
			escreva("Você digitou 0")
		}
	}
}
		 * 
		 */
		Scanner leia = new Scanner (System.in);
		
		int valorUsuario;
		System.out.print("Digite um valor: ");
		valorUsuario = leia.nextInt();
		
		if (valorUsuario > 0) 
		{
			if ((valorUsuario % 2 ) == 0) 
			{
				System.out.print("O valor é positivo e par");
			}
			else
			{
				System.out.print("O valor é positivo e ímpar");
			}
		}
		
		else if (valorUsuario <0 ) 
		{
			if ((valorUsuario % 2) == 0) 
			{
			System.out.print("O valor é negativo e par");
			}
			else {
				System.out.print("O valor é negativo e ímpar");
			}
		}
		
		else {
			System.out.println("Você digitou 0");
	
	
		}
	}

}
