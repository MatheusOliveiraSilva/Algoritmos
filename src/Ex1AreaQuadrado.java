import java.util.Scanner;

/* Coletar o valor do lado de um quadrado, 
 * 
 * calcular sua ·rea e apresentar o resultado. */

public class Ex1AreaQuadrado {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int ladoQuadrado = 0;
		int area = 0;
		
		System.out.print("Digite o valor do lado do quadrado:");
		ladoQuadrado = ler.nextInt();
		
		area = ladoQuadrado * ladoQuadrado;
		
		System.out.println("\n¡rea do quadrado = " + area);
		ler.close();
	} 
}
