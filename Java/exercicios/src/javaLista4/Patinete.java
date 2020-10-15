package javaLista4;

public class Patinete {
	
	
	public String cor;
	public int quantaRodas;
	public String Anda;
	public double velocidadeAtual;
	public double aceleracao = +20;
	public double freio = 20;
	public double velocidadeNova;
	public void pessoasubiuEAndou ()
	{
		velocidadeNova = velocidadeAtual + aceleracao;
	}
	public void parada()
	{
		
		velocidadeNova=0;
	}
	public void criancaRe ()
	{
		velocidadeNova = velocidadeAtual - freio;
	
	}
	
}
