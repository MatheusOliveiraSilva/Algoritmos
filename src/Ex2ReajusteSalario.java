import java.util.Scanner;
/*Receba o sal�rio de um funcion�rio e mostre o 
 * 
 * novo sal�rio com reajuste de 15%. */

public class Ex2ReajusteSalario {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		float salario = 0f;
		float reajusteSalarial = 0f;
		
		System.out.print("Digite o salario atual do funcionario");
		salario = ler.nextFloat();
		
		reajusteSalarial = salario * 0.15f + salario; 
		System.out.println("Salario com reajuste de 15%: " + reajusteSalarial);
		ler.close();
	}
}
