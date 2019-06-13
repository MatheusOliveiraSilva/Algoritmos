import java.util.Scanner;

/* Receba a base e a altura de um triângulo. 
 * 
 * Calcule e mostre a sua área. */

public class Ex3CalculoAreaTriangulo {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int baseTriangulo = 0;
		int alturaTriangulo = 0;
		int areaTriangulo = 0;
		
		System.out.print("Digite a altura do triangulo: ");
		alturaTriangulo = ler.nextInt();
		
		System.out.print("\n\nDigite a base do triangulo: ");
		baseTriangulo = ler.nextInt();
		
		areaTriangulo = alturaTriangulo * baseTriangulo / 2;
		
		System.out.print("\n\nA area do triangulo e igual:" + areaTriangulo);
		ler.close();
	}
}
