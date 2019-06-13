import java.util.Scanner;
/* Receba os coeficientes A, B e C de 
 * 
 * uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes)*/

public class Ex5EquacaoSegundoGrau {
	public static void main(String arg[]) {
		Scanner ler = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double x = 0;
		double raiz1 = 0;
		double raiz2 = 0;
		double delta = 0;
		
		System.out.print("Digite o coeficiente A: ");
		a = ler.nextDouble();
		
		System.out.println("\n\nDigite o coeficiente B: ");
		b = ler.nextDouble();
		
		System.out.println("\n\nDigite o coeficiente C");
		c = ler.nextDouble();
		
		delta = b * b - 4 * a * c;
		raiz1 = (-b +  Math.sqrt(delta)) / 2 * a; 
		raiz2 = (-b -  Math.sqrt(delta)) / 2 * a;
		
		System.out.println("Raiz 1:" + raiz1 + "\nRaiz 2: " + raiz2+ " \nDelta:" + delta);
		ler.close();
	}
}
