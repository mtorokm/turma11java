package entidades;

public class Cavalo extends Animal {
	
	public Cavalo(String nome)
	{
		super(nome);
		
	}
	
	@Override 
	
	public void emitirSom()
	{
		System.out.println("Hiin in in");
	}
	
	public void correr()
	{
		System.out.println("O CAVALO ESTÁ CORRENDO...");
	}
	
	
	
}


