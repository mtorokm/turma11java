package EstudandoJava;

import java.util.Scanner;

public class javaLista1Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*Fa�a um programa que receba a idade de uma pessoa
		 *  e mostre na sa�da em qual categoria ela se encontra:
           10-14 infantil
           15-17 juvenil
           18-25 adulto
		 * 
		 */
	int idade;
	
	System.out.print("Digite a sua idade");
	idade = leia.nextInt();
	
	if(idade>=10 && idade<=14)
	{
		System.out.print("Voc� � classificado como : Infantil");
	}
	else if(idade>=15 && idade<=17)
	{
		System.out.print("Voc� � classificado como : Juvenil");
	}
	
	else if(idade>= 18 && idade<=25)
	{
		System.out.print("Voc� � classificado como : Adulto");
	}
	else
	{
		System.out.print("Voc� n�o se encaixa nas classifica��es ");
	}
	
	leia.close();
	}

}
