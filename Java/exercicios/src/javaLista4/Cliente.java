package javaLista4;

import java.util.Scanner;


public class Cliente {
/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe,
 *  em seguida crie um objeto cliente,
 *  defina as instancias deste objeto 
 *  e apresente as informa��es deste objeto no console.
 * 
 */
	Scanner leia = new Scanner(System.in);
	public String nome;
	public int anoNascimento;
	public char sexo;
	public double dinheiroDado;
	public double troco;
	public final double TOTALASERPAGO = 80;
 
	
	
	
	public  void pagamento()
	{
		
		System.out.println("DIGITE O QUANTO VC DEU DE DINHEIRO");
		dinheiroDado = leia.nextDouble();
		troco = dinheiroDado-TOTALASERPAGO;
		if(dinheiroDado<TOTALASERPAGO) {
			
			 System.out.println("DINHEIRO INSUFICIENTE, VOLTE OUTRA HORA");
			
		}else
		{
			System.out.println("SEU TROCO � : "+troco);
		}
		
		
	
	}
	public void imprimeTOTALASERPAGO()
	{
		System.out.println("VOC� TEM QUE PAGAR :"+TOTALASERPAGO);
		
	}
	
	







}
