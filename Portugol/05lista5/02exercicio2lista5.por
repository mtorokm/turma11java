programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
           * Elabore um programa que *leia o peso e a altura de um adulto* e mostre sua condição de acordo com a tabela abaixo. 
           * IMC em adultos Condição 
           * Abaixo de 18.5 Abaixo do peso 
           * Entre 18.5 e 25 Peso normal 
           * Entre 25 e 30 Acima do peso 
           * Acima de 30 obeso 
		 */
			real altura,peso,imc
			escreva("Digite o seu peso : ")
			leia(peso)
			pulalinha()
			escreva("Digite a sua altura : ")
			leia(altura) 
			pulalinha()
			imc=(peso/(altura*altura))
			mat.arredondar(imc, 2)

			se(imc<18.5)
			{
				escreva("Você está classificado/a como: abaixo do peso")
			}
			senao se(18.5<imc e imc<25)
			{
				escreva("Você está classificado/a como: peso normal")
			}
			senao se(25<imc e imc<30)
			{
				escreva("Você está classificado/a como: acima do peso")
			}
			senao
			{
				escreva("Você está classificado/a como: obeso")
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
 * @POSICAO-CURSOR = 528; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */