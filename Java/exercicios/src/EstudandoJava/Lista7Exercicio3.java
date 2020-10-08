package EstudandoJava;

import java.util.Scanner;

public class Lista7Exercicio3 {

	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos.
		 *  O programa termina quando idade for =-99. 
		 *  (WHILE)
		 */
		Scanner leia = new Scanner (System.in);
	int total21Menor=0,total50Plus=0,idade = 0;
	
	while(idade<99)
	{
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		if(idade<=21 && idade>0) 
		{
			total21Menor++;
			
		}
		else if(idade>50)
		{
			total50Plus++;
		}
		
	}
	System.out.printf("Pessoas menores de 20 anos : %d\nPessoas maiores de 50 anos : %d",total21Menor,total50Plus);
	
	
	}

}
