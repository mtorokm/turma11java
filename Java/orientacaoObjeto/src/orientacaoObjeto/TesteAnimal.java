package orientacaoObjeto;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class TesteAnimal {

	public static void main(String[] args) {

		Cachorro pet1 = new Cachorro ("Juanito");
		Cavalo pet2 = new Cavalo("Jorge");
		Preguica pet3 = new Preguica("Pablo");
		pet1.setIdade(8);
		pet2.setIdade(13);
		pet3.setIdade(3);
		
		System.out.println(
		 pet1.getNome()
		+pet1.getIdade()
		+pet2.getNome()
		+pet2.getIdade()
		+pet3.getNome()
		+pet3.getIdade());
		 pet1.correr();
		 pet1.emitirSom();
		 pet2.correr();
		 pet2.emitirSom();
		 pet3.emitirSom();
		 pet3.escalarArvore();
		
		

	
	
	
	}

}
