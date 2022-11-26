package if_else;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		
		if (codigo == 1) {
			total = quantidade * 4.00;
		} else if (codigo == 2) {
			total = quantidade * 4.50;
		} else if (codigo == 3) {
			total = quantidade * 5.00;
		} else if (codigo == 4) {
			total = quantidade * 2.00;
		} else {
			total = quantidade * 1.50;
		}
		
		System.out.println("Total: R$ " + total);

		sc.close();
	}

}
