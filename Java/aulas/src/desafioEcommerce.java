import java.util.Scanner;

public class desafioEcommerce {
			
		public static String nomeIn;

		public static char sexoIn;

		public static Scanner leia = new Scanner(System.in);

		public static int cod[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
				quantEstoque[] = { 16, 10, 30, 25, 29, 12, 18, 22, 26, 11 },
				parcelaIn = 0,
				 quantIn[] = new int[10];
				 
		
		public static double valorUnitario[] = { 86, 90, 40, 35, 50, 60, 32, 30, 50, 63 },
				valorTotal[] = new double[10],
				valorTotalCarrinho, impostoTotalCarrinho,
				descontoAvista = 0,
				valorTaxa[] = new double[10];
		
		public static boolean carrinho = false,
				coletaNome = false;
				
				

		public static String produtoNome[] = { "PythonMan", "Else Kruger", "Noite dos Errors", "O Jorro",
				"Tech Leader América", "Dev de Ferro", "Capitão Cod", "Java Snow", "For Fantástico", "Capitã Main" };

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int menuprincipalIn= 1;
			int navegadorInternoIn = 0;
			int navIntCarrinhoIn = 0;
			while(true) {
				if(coletaNome == false)
				{
					nomeGet();
					imprimirNome();
				}
				else 
				{
					linha();
					if(menuprincipalIn == 0) break;
					System.out.println("Menu Principal: Digite 1 - para comprar / 2 para carrinho / 0 - para sair ");
					menuprincipalIn = leia.nextInt();
					if(menuprincipalIn == 0) break;
					
					
					if (menuprincipalIn == 1) // menu de compra
					{
						navegadorInternoIn = 1;
						
						while (true) {
							if(navegadorInternoIn == 0) break;
							linha();
							System.out.println("Menu Compra");
							compra();
							while(true) {
								System.out.println("deseja comprar mais produtos 1 - sim / 0 - nao");
								navegadorInternoIn = leia.nextInt();
								if(navegadorInternoIn == 0 || navegadorInternoIn == 1) break;
								
							}
						}
					}
					
					if (menuprincipalIn == 2) // menu de carrinho
					{
						navegadorInternoIn = 1;
						navIntCarrinhoIn = 0;
						while (true) {
							if(navegadorInternoIn == 0) break;
							linha();
							System.out.println("Menu Carrinho");
							checarCarrinho();
							if(carrinho) {
								while (true) {
								System.out.println("Digite: \n 1 - finalizar compra \n 2 - editar carrinho \n 0 - para menu principal \n Leitura :");
								navIntCarrinhoIn = leia.nextInt();
								if (navIntCarrinhoIn == 1 || navIntCarrinhoIn == 2  || navIntCarrinhoIn == 0) break;
								System.out.println("Opção invalida");
								}
								
								if(navIntCarrinhoIn == 1) // menu de pagamento
								{
									pagamento();
									
									navegadorInternoIn =0;
									navIntCarrinhoIn = 0;
									System.out.println();
									linha();
									System.out.println("Compra finalizada");
									
									linha();
									while (true) {
										System.out.println("Novo usuario ? \n1 - sim \n0 - sair do programa  ");
										navegadorInternoIn = leia.nextInt();
										if (navegadorInternoIn == 0 || navegadorInternoIn == 1) break;
										
									}
									if(navegadorInternoIn == 1)
									{
										novoUsuario();
										navegadorInternoIn = 0;
										menuprincipalIn =1;
										navIntCarrinhoIn = 0;
										
									} 
									else if (navegadorInternoIn == 0) 
									{
										menuprincipalIn =0;
										navegadorInternoIn = 0;
										navIntCarrinhoIn = 0;
										break;
									}
									
									
									
								}
								else if (navIntCarrinhoIn == 2) // menu editar carrinho
								{
									while (true) {
										removerItemCarrinho();
										
										while (true)
										{
											System.out.println("Retirar outro item: 1 - sim / 0 - nao :");
											navegadorInternoIn = leia.nextInt();
											if (navegadorInternoIn == 0) break;
											System.out.println("Opção invalida");
										}
										
										if (navegadorInternoIn == 0) break;
									}
									
									
								} 
								
								else // escape
								{
									navegadorInternoIn =0;
									
								}
								
								
								
							} else {
								while(true) {
									System.out.println("Carrinho Vazio digite 0 para voltar ao menu principal");
									navegadorInternoIn = leia.nextInt();
									if(navegadorInternoIn == 0 ) break;
									
								}
								
							}
						}
						
					}
					
					
					
				}
				
			}
			
			leia.close();
			
			
			
		}
		
		public static void pagamento () {
			imprimirCarrinho();
			int opcIn , opcIn2;
			while (true) {
				System.out.print("Qual a forma de pagamento, 1 - A vista (10% OFF)/ 2 - parcelado (até 3 vezes sem juros)");
				opcIn =	leia.nextInt();
			
				if (opcIn ==1 || opcIn ==2) break;
				
				System.out.println("Codigo invalido !!");
			}
			
			if (opcIn == 1) {
				
				descontoAvista = valorTotalCarrinho*0.1 ;
				ImprimirNota ();
				
			}
			
			if (opcIn == 2 ) {
				while (true) {
				System.out.print("Digite o número de parcelas, (2 ou 3 vezes): ");
				opcIn2 = leia.nextInt();
				 if (opcIn2 == 2 || opcIn2 == 3) break;
					System.out.println("Codigo invalido !!");
				
				}
				
				parcelaIn = opcIn2;
				ImprimirNota ();
			}
			
			
			
		}
		
		public static void ImprimirNota () {
			imprimirCarrinho();
			
			
			
			if (descontoAvista >0) {
				linha();
				System.out.println("\nNOTA FISCAL");
				System.out.printf("Desconto %.2f \n Valor imposto R$ %.2f \n Valor total com desconto R$ %.2f ", descontoAvista , impostoTotalCarrinho , (valorTotalCarrinho - descontoAvista));
			}
			 else {
					System.out.println("\nNOTA FISCAL");
					System.out.printf("Quantidade de parcelas %d \n Valor imposto R$ %.2f \n Valor por parcela R$ %.2f", parcelaIn , impostoTotalCarrinho ,( valorTotalCarrinho/parcelaIn));
			 }
		}
		
		public static void novoUsuario() {
			nomeIn = "";
			sexoIn = ' ';
			coletaNome = false;
			descontoAvista = 0;
			parcelaIn = 0;
			valorTotalCarrinho = 0;
			impostoTotalCarrinho = 0;
			for(int contador=0;contador<10;contador++) {
				quantIn [contador]= 0;
				valorTaxa [contador] = 0.0;
				valorTotal [contador] = 0.0;
				
			}
		}
		
		public static void checarCarrinho() {
			carrinho = false;
			for(int contador=0;contador<10;contador++) {
				if (quantIn[contador]>0) carrinho =true;
			}
			
		}
		
		public static void imprimirNome() {
			if(sexoIn == 'H')System.out.printf("Bem vindo %s a nossa loja Cod In Fantasy \n",nomeIn);
			if(sexoIn == 'M')System.out.printf("Bem vinda %s a nossa loja Cod In Fantasy \n",nomeIn);
			if(sexoIn == 'O')System.out.printf("Bem vinde %s a nossa loja Cod In Fantasy \n",nomeIn);
		}
		

		public static void nomeGet() 
		{
			linha();
			System.out.println("Cod In Fantasy store");
			linha();
			coletaNome = true;

			System.out.print(" Por favor digite o seu nome : ");
			nomeIn = leia.next();

			//System.out.println(nomeIn);
			do {
				System.out.print("Digite o seu sexo : H-homem, M-mulher, O-outros ");
				sexoIn = leia.next().toUpperCase().charAt(0);

			} while (sexoIn != 'H' && sexoIn != 'M' && sexoIn != 'O');	

		}
		
		public static void imprimirEstoque() 
		{
			int contador = 0;
			linha();

			System.out.println("CÓDIGO--------Estoque-----------Valor-----------Fantasia\n");
			for(contador=0;contador<10;contador++)
			{

				
				System.out.printf("   %d\t\t%d\t\t%.2f\t\t%s\n",cod[contador],quantEstoque[contador],valorUnitario[contador],produtoNome[contador]);


			}

		}
		public static void linha() {
			System.out.println("*******************************************************************************");
		}
		
		public static void imprimirCarrinho() 
		{
			int contador = 0;
			valorTotalCarrinho =0;
			impostoTotalCarrinho = 0;
			linha();
			System.out.println("CÓDIGO---Quant---Valor Unitario(R$)---Imposto(R$)---Total(R$)---Fantasia\n");
			for(contador=0;contador<10;contador++)
			{

				if(quantIn[contador]>0)	{
					System.out.printf("  %d\t   %d\t\t%.2f\t\t%.2f\t      %.2f\t%s\n",cod[contador],quantIn[contador],valorUnitario[contador],valorTaxa[contador],valorTotal[contador],produtoNome[contador]);
					valorTotalCarrinho += valorTotal[contador];
					impostoTotalCarrinho += valorTaxa[contador];
				}
			}
			linha();
			System.out.printf("Total de imposto é :R$%.2f \n",impostoTotalCarrinho);
			System.out.printf("Total a pagar é :R$%.2f \n",valorTotalCarrinho);
			
		}
		
		public static void compra()
		    {
		    int podIn=0,qIn;	
			
			imprimirEstoque();
			linha();
			do
			{
				System.out.print("Digite o código do produto que você deseja comprar : ");
				
				podIn = leia.nextInt();
				
				if(podIn<0 || podIn>9)
				{
					System.out.println("Código inválido, digite novamente.");
				}
			
			
			}while(podIn<0 || podIn>9);
			
		
			do
			{
		
				System.out.printf("Pruduto : %s, foi selecionado. Digite a quantidade : ",produtoNome[podIn]);
				qIn = leia.nextInt();
				
				if( (qIn>quantEstoque[podIn]) || qIn<=0)
				{
					System.out.println("Quantidade inválida, digite novamente.");
				}
				
			}while((qIn>quantEstoque[podIn]) || qIn<=0);
			
			
			quantIn[podIn] += qIn;
			
			valorTotal[podIn]=quantIn[podIn]* valorUnitario[podIn];
			
			valorTaxa[podIn]=valorTotal[podIn]*0.09;
			
			valorTotal[podIn]+=valorTaxa[podIn];
			
			quantEstoque[podIn]-=qIn;
			
			System.out.printf("Produto : %s\nQuantidade : %d\nADICIONADO AO CARRINHO",produtoNome[podIn],quantIn[podIn]);
			
			System.out.println();
			
			imprimirCarrinho();
	        }
		
		public static void removerItemCarrinho() {
			 int podIn=0,qIn;	
				
				imprimirCarrinho();
				linha();
				do
				{
					System.out.print("Digite o código do produto que você deseja remover : ");
					
					podIn = leia.nextInt();
					
					if(podIn<0 || podIn>9)
					{
						System.out.println("Código inválido, digite novamente.");
					}
				
				
				}while(podIn<0 || podIn>9);
				
			
				do
				{
			
					System.out.printf("Produto : %s, foi selecionado. Digite a quantidade que deseja remover : ",produtoNome[podIn]);
					qIn = leia.nextInt();
					
					if( (qIn>quantEstoque[podIn]) || qIn<=0)
					{
						System.out.println("Quantidade inválida, digite novamente.");
					}
					
				}while((qIn>quantEstoque[podIn]) || qIn<=0);
				
				
				quantIn[podIn] -= qIn;
				
				valorTotal[podIn]=(quantIn[podIn]* valorUnitario[podIn])*1.09;
				
				valorTaxa[podIn]=(quantIn[podIn]* valorUnitario[podIn])*0.09;
				
				quantEstoque[podIn]+=qIn;
				
				System.out.printf("Produto : %s\nQuantidade : %d\nREMOVIDO DO CARRINHO",produtoNome[podIn],quantIn[podIn]);
				
				System.out.println();
				
				imprimirCarrinho();
			
		}

	}
