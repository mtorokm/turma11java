package orientacaoObjeto;

import java.util.Scanner;

import entidades.Aluno;
import entidades.Professor;

public class CadEscolar {

	public static void main(String[] args) {
		//É AQUI Q VC VAI CRIAR OS OBJETOS
	Scanner leia = new Scanner(System.in);
	Professor primeiro = new Professor();//ctrl + shift + O
	Aluno primeiroAluno = new Aluno();
	
	char info;
	
	System.out.print("Digite o nome:");
	primeiro.nome = leia.next().toUpperCase();//      .Nome = atributo leia.next()=metodo
	System.out.print("Digite o sexo M-masculino,F-feminino ou O-outros:");
	primeiro.sexo = leia.next().toUpperCase().charAt(0);
	System.out.print("Digite a especialidade do professor: ");
	primeiro.especialidade = leia.next().toUpperCase();
	System.out.println("Digite o ano de nascimento do professor :");
	primeiro.anoNascimento = leia.nextInt();
	System.out.print("O professor é F-fixo ou C-convidade :");
	info = leia.next().toUpperCase().charAt(0);
	if(info == 'C') {//criou uma variavel auxiliar chamada info e tranformou em boolean, para facilitar a leitura do usuario pois este estranha falar verdadeirou ou falso.
		primeiro.convidado = true;
		
	} else {
		primeiro.convidado = false;
	}
	
	System.out.println("DADOS DO PRIMEIRO PROFESSOR:");
	System.out.println("Nome: "+primeiro.nome);
	System.out.print("Sexo: ");
	System.out.println((primeiro.sexo=='F')?"Feminino":(primeiro.sexo=='M')?"Masculino":"Outros");
	System.out.println("idade :"+(2020-primeiro.anoNascimento));
	
	
	System.out.println("Digite o nome do aluno: ");
	primeiroAluno.nome = leia.next().toUpperCase();
	System.out.println("Digite o sexo do aluno: ");
	primeiroAluno.sexo = leia.next().toUpperCase().charAt(0);
	System.out.println("Digite o ano nascimento: ");
	primeiroAluno.anoNascimento=leia.nextInt();
	System.out.println("Digite o curso do aluno: ");
	primeiroAluno.curso = leia.next().toUpperCase();
	System.out.println("Digite a nota geral do aluno: ");
	primeiroAluno.notaGeral = leia.nextDouble();
	
	
	System.out.println("ALUNO");
	
	System.out.println("Nome: "+primeiroAluno.nome);
	System.out.print("Sexo: ");
	System.out.println((primeiroAluno.sexo=='F')?"Feminino":(primeiroAluno.sexo=='M')?"Masculino":"Outros");
	System.out.println("idade :"+(2020-primeiroAluno.anoNascimento));
	System.out.println("STATUS");
	System.out.println((primeiroAluno.notaGeral <5.0)?"REPROVADO":"APROVADO");
	
	
	
	
	leia.close();
	}

}
