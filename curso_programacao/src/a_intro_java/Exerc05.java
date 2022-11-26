package intro_java;
import java.util.Locale;
import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, numeroPecas1, numeroPecas2;
		double valorUnitario1, valorUnitario2, total1, total2, soma;
		codigo1 = sc.nextInt();
		numeroPecas1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		total1 = numeroPecas1 * valorUnitario1;
		
		codigo2 = sc.nextInt();
		numeroPecas2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		total2 = numeroPecas2 * valorUnitario2;
		
		soma = total1 + total2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", soma);
		sc.close();
	}

}
