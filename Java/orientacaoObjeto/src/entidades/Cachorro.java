package entidades;

public class Cachorro extends Animal 
{
	//CONSTRUTORES 
	public Cachorro(String nome)
	{
		super(nome);
		
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("AU AU AU!");
	}
	
	
	public void  correr()
   {
		System.out.println("CORRENDO...");
   }

   
}
