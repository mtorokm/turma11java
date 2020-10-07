programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * 1-	Elabore um programa que calcule o que deve ser pago por um produto,
		 * considerando o preço normal de etiqueta e a escolha da condição de pagamento
		 * .Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
		 * escolhida e efetuar o cálculo adequado.
			Código Condição de pagamento
			1 À vista em dinheiro ou cheque, recebe 20% de desconto
			2 À vista no cartão de crédito, recebe 15% de desconto
			3 Em duas vezes, preço normal de etiqueta sem juros
			4 Em três vezes, preço normal de etiqueta mais juros de 10%
		 *
		 */
		 const inteiro LIMITE=4
		cadeia produtos[] = {"Camisa","Calça","Camiseta","Vestido"}
		real precos[] = {100.00, 300.50, 90.75, 250.00},desconto,acrescimo,arredondado,vaiPagar
		inteiro x
		inteiro codigo
		inteiro pgto
		para (x = 0; x<LIMITE;x++)
		{
			escreva("Codigo produto ",x+1," ",produtos[x],"  R$ ",precos[x])
			pulalinha()
		}
		escreva("Vai compra o que? Digite o codigo do produto:")
		leia(codigo)
		codigo= codigo-1
		pulalinha()
		escreva("Vc escolheu ",produtos[codigo]," no valor de ", precos[codigo])
		pulalinha()
		escreva("Vai pagar como:\n")
		escreva("1 À vista em dinheiro ou cheque, recebe 20% de desconto \n")
		escreva("2 À vista no cartão de crédito, recebe 15% de desconto \n")
		escreva("3 Em duas vezes, preço normal de etiqueta sem juros \n")
		escreva("4 Em três vezes, preço normal de etiqueta mais juros de 10%\n")
		escreva("Digite o numero da opcao:")
		leia(pgto)

		se(pgto == 1)
		{
			desconto = (precos[codigo]/5)
			pulalinha()
		escreva("o valor que deverá ser pago, contando com o desconto de 20%, é de : ", precos[codigo]-desconto)
		}
		senao se(pgto == 2)
		{
			desconto = ((precos[codigo]*3)/20)) 
			vaiPagar = precos[codigo]-desconto
			escreva("O valor que deverá ser pago, contando com o desconto de 15%, é de : ", mat.arredondar(vaiPagar,2))
		}
		senao se(pgto == 3)
		{
			vaiPagar = precos[codigo]/2
		escreva("O valor que deverá ser pago será duas parcelas de : ", mat.arredondar(vaiPagar,2))			
		
		} senao{ 
		acrescimo = ((15*precos[codigo])/100)
		vaiPagar = precos[codigo]+acrescimo
		escreva("O valor que deverá ser pago, contando com o acréscimo de 15%, será três parcelas de :",mat.arredondar(vaiPagar,2))
		}
	
	
	}
	funcao pulalinha()
	{
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */