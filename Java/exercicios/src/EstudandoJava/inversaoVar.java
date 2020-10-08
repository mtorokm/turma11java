package EstudandoJava;

import java.util.Scanner;

public class inversaoVar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a=0,b=0;
		System.out.print("Leia A:");
		a = leia.nextInt();
		System.out.println();
		System.out.print("Leia B:");
		b = leia.nextInt();
		System.out.println("Valores antes da inversão: A - "+a+"; B - "+b);
		System.out.println();
		System.out.println("Valores depois da inversão: A - "+((a-a)+b)+"; B - "+(b-b)+a);
		leia.close();
}


}

