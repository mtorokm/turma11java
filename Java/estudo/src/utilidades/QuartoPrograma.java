package utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args)
	{
	//criar um teclado dentro do programa
		Scanner tec = new Scanner(System.in); // criou o teclado
		
	String nome;
	int anoNascimento, idade = 0;//sugestao, na duvida inicialize a variavel, pq em algum momento vai dar erro
	double salario;
	
	System.out.print("Escreva o nome do usuario: ");
	nome = tec.next(); 
	System.out.print("Escreva o ano de nascimento: ");
	anoNascimento =  tec.nextInt();
	System.out.print("Escreva o salario: ");
	salario = tec.nextDouble();
	idade= 2020-anoNascimento;
	//System.out.printf("oi %s, sua idade �  %d em anos e seu salario %.2f",nome,idade,salario);
	System.out.printf("Oi %s ", nome);
	tec.close();

	}

}