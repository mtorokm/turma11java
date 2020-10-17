package entidades;

public class Animal {
	private String nome;
	private int idade;
	
	//CONSTRUTOR
			public Animal(String nome)
				{
					this.nome = nome;
		
				}
	//ENCAPSULAMENTO
		public String getNome()
		{
			return this.nome;
			
		}
		public void setNome(String nome)
		{
			this.nome = nome;
		}
		
		public int getIdade()
		{
			return this.idade;
		}
		public void setIdade(int idade)
		{
			this.idade = idade;
		}
	
	//METODOS
		public void  emitirSom()
		{
			
		}
		
	
	
}
