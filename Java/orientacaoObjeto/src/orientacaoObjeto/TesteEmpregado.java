package orientacaoObjeto;

import entidades.Empregado;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado mathias = new Empregado("Mathias",6457, 1000,20);
		
		System.out.println("O empregado/a "+mathias.getNome()+" do setor "+mathias.getCodigoSetor()+" revebe salário de : "+mathias.calculoSalario());
			

	}

}
