import java.util.Locale;
import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {

		int funcionario, horasTrabalhadas;
		double valorPorHora, salario;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		funcionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorPorHora = sc.nextDouble();
		salario = horasTrabalhadas * valorPorHora;
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();
	}
}
