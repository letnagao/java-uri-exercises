package if_else;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		int A, B;
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Mutiplos");
		}
		
		sc.close();
	}
}
