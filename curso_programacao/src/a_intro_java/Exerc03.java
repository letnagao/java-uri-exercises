package a_intro_java;
import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		int A, B, C, D;
		 
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int Diferenca = (A * B - C * D);
		System.out.println("DIFERENCA = " + Diferenca);
		
		sc.close();
	}

}
