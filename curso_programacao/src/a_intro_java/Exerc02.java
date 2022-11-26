package a_intro_java;
import java.util.Locale;
import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, A, pi, raioQuadrado;
		
		raio = sc.nextDouble();
		pi = 3.14159;
		raioQuadrado = Math.pow(raio, 2);
		A = pi * raioQuadrado;
		System.out.printf("A=%.4f", A);
		sc.close();
		
	}

}
