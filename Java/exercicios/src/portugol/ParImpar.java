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
				escreva("O valor � positivo e par")	
			}
			senao {
				escreva("O valor � positivo e �mpar")
			}
		}
		senao se (valorUsuario <0) {
			se ((valorUsuario % 2) == 0) {
			escreva("O valor � negativo e par")
			}
			senao {
				escreva("O valor � negativo e �mpar")
			}
		}
		senao {
			escreva("Voc� digitou 0")
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
				System.out.print("O valor � positivo e par");
			}
			else
			{
				System.out.print("O valor � positivo e �mpar");
			}
		}
		
		else if (valorUsuario <0 ) 
		{
			if ((valorUsuario % 2) == 0) 
			{
			System.out.print("O valor � negativo e par");
			}
			else {
				System.out.print("O valor � negativo e �mpar");
			}
		}
		
		else {
			System.out.println("Voc� digitou 0");
	
	
		}
	}

}
