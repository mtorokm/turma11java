package javaLista4;

import java.util.Scanner;

public class Lista4Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Patinete um = new Patinete();
		System.out.println("DIGITE A COR DO PATINETE");
		um.cor = leia.nextLine();
		
		System.out.println("QUAL A SUA VELOCIDADE ATUAL?");
		um.velocidadeAtual = leia.nextDouble();
		if(um.velocidadeAtual>0) {
		um.criancaRe();
		System.out.println("A VELOCIDADE ATUAL É :"+um.velocidadeNova);
		}else if(um.velocidadeAtual==0.0) {
			um.parada();
			System.out.println("VELOCIDADE = 0");
		}
		else if(um.velocidadeAtual<0)
		{
			um.criancaRe();
			System.out.println("A VELOCIDADE ATUAL É :"+um.velocidadeNova);
		}
		System.out.println("A COR É "+um.cor);
		

	}

}
