package portugol;

import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		/*inteiro custoFabrica, carroNovo
	     *escreva("Digite o custo de fábrica")
	     * leia(custoFabrica)
	     * carroNovo = ((custoFabrica*28)/100) + ((custoFabrica*45)/100) + custoFabrica
	     * escreva("O preço total a ser pago pelo carro novo é de", carroNovo)
		 * 
		 */
		int custoFabrica, carroNovo;
		System.out.print("Digite o custo de fábrica");
		custoFabrica = leia.nextInt();
		carroNovo = ((custoFabrica*28)/100) + ((custoFabrica*45)/100) + custoFabrica;
		System.out.print("O preço total a ser pago pelo carro novo é de" + carroNovo);
		
		
		
	}

}
