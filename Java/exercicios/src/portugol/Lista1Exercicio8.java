package portugol;

import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		/*inteiro custoFabrica, carroNovo
	     *escreva("Digite o custo de f�brica")
	     * leia(custoFabrica)
	     * carroNovo = ((custoFabrica*28)/100) + ((custoFabrica*45)/100) + custoFabrica
	     * escreva("O pre�o total a ser pago pelo carro novo � de", carroNovo)
		 * 
		 */
		int custoFabrica, carroNovo;
		System.out.print("Digite o custo de f�brica");
		custoFabrica = leia.nextInt();
		carroNovo = ((custoFabrica*28)/100) + ((custoFabrica*45)/100) + custoFabrica;
		System.out.print("O pre�o total a ser pago pelo carro novo � de" + carroNovo);
		
		
		
	}

}
