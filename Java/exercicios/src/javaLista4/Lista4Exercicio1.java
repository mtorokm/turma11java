package javaLista4;

import java.util.Scanner;

public class Lista4Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Cliente primeiro = new Cliente();
		
		System.out.println("DIGITE O SEU NOME");
		primeiro.nome = leia.next();
		System.out.println("DIGITE A SUA OPÇÃO SEXUAL H-HOMEM M-MULHER O-OUTROS");
		primeiro.sexo = leia.next().toUpperCase().charAt(0);
		System.out.println("DIGITE O ANO DE SEU NASCIMENTO");
		primeiro.anoNascimento = leia.nextInt();
		primeiro.imprimeTOTALASERPAGO();
		primeiro.pagamento();
		
		
	
	
		
	}

}
