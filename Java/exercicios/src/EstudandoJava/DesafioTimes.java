package EstudandoJava;

import java.util.Scanner;

public class DesafioTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*VETOR COM OS 4 TIMES DE S�O PAULO
            CORINTHIANS
            PALMEIRAS
            SPFC
            SANTOS
            GANHA - 3 PONTOS
            EMPATA - 1 PONTO
            PERDE - 0 PONTO
		    PRIMEIRA RODADA
            CADA TIME SE GANHOU, PERDEU OU EMPATOU
			MOSTRA A PONTUA��O DA PRIMEIRA RODADA
			SEGUNDA RODADA
			RESULTADOS J� COM A SEGUNDA RODADA
            TERCEIRA RODADA - MESMA COISA
            +rodada sim ou n�o
            1-vetor pontos 2-vetor times
		 */
		Scanner leia = new Scanner(System.in);

		//variaveis
				String times[] = {"CORINTHIANS","PALMEIRAS", "SPFC","SANTOS"}; //0-3
				int pontos[] = {0,0,0,0};
				char resultado; // GANHOU PERDEU EMPATOU
				char opc = 'S'; //S sim e N n�o
				int contador = 1;
				
				
				
				//momento inicial
				System.out.println("\nANTES DOS JOGOS");
				for (int x = 0; x < pontos.length; x++ ) { //(int x = 0; x < 4; x++ ){
					
					System.out.printf("\nEQUIPE - %s PONTOS: %d", times[x], pontos[x]);
				}
				//UMA RODADA
				
				System.out.println("PROCESSO DE RODADAS\n");
				while (opc=='S')
				{
					System.out.printf("RODADA N� : %d", contador);
					
					for (int x = 0; x < pontos.length; x++ )
					{
						
						System.out.printf("\nEQUIPE - %s Digite G-ganhou, E-empatou ou P-perdeu : ", times[x]);
						resultado = leia.next().toUpperCase().charAt(0);
						if (resultado =='G') {
							pontos[x] = pontos[x]+3;
						} else if (resultado =='E') {
							pontos[x] = pontos[x]+1;
						} else if (resultado =='P') {
						  pontos[x] = pontos[x]+0;
						}
						
					}
					System.out.println("\nTABELA AT� O MOMENTO!!!");
					for (int x = 0; x < pontos.length; x++ )
					{
						System.out.printf("\nEQUIPE - %s PONTOS: %d", times[x], pontos[x]);
					}
					
					//fuga
					System.out.println("\nContinua sim ou n�o: ");
					opc = leia.next().toUpperCase().charAt(0);
					contador++;
					
				}
				System.out.println("Resultado ap�s rodadas");
				for (int x = 0; x < pontos.length; x++ )
				{
					System.out.printf("\nEQUIPE - %s PONTOS: %d", times[x], pontos[x]);
				}
				linha();
				
				
				leia.close();
				
			}
			
			public static void linha()
			{
				System.out.println("\n-------------------------------------------------");
			}
			
		}
