package entidades;

public class Preguica extends Animal {

	public Preguica (String nome)
	{
		super(nome);
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("ZzZzZz");
	}
	
	public void escalarArvore()
	{
		System.out.println("Escalando árvore ");
	}
	
	
	
}
