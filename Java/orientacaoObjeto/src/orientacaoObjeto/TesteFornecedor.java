package orientacaoObjeto;

import entidades.Fornecedor;
import entidades.Pessoa;

public class TesteFornecedor {

	public static void main(String[] args) {
		Pessoa comum1 = new Pessoa();
		Pessoa comum2 = new Pessoa("Jo�o");
		Pessoa comum3 = new Pessoa("J�lia","Rua x");
		Fornecedor fornecedor1 = new Fornecedor("J�lia",10000.50,4500.50);
		Fornecedor fornecedor2 = new Fornecedor("jessie",9000,4500);
		
		System.out.println("O saldo do fornecedor/a "+fornecedor1.getNome()+" � de :"+fornecedor1.obterSaldor() );
		System.out.println("O saldo do fornecedor/a "+fornecedor2.getNome()+" � de :"+fornecedor2.obterSaldor());

	}

}
