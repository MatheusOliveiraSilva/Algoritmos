import java.util.Scanner;

/* Receba a temperatura em graus Celsius. 
 * 
 * Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5. */

public class Ex4CelsiusParaFahrenheit {
	public static void main( String args[] ) {
		Scanner ler = new Scanner( System.in );
		float celsius = 0f;
		float fahrenheit = 0f;
		
		System.out.print( "Digite a temperatura em graus celsius: " );
		celsius = ler.nextFloat();
		
		fahrenheit = ( 9 * celsius + 100 ) / 5;
		
		System.out.println( "Temperatura em Fahrenheit: " + fahrenheit );
		ler.close();
	}
}
