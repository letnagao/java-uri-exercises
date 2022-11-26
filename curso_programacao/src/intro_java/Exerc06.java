package intro_java;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Exerc06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, CQuadrado, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2;
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		
		CQuadrado = Math.pow(C, 2);
		circulo = 3.14159 * CQuadrado; 
		System.out.printf("CIRCULO: %.3f%n", circulo);
		
		trapezio = (A + B) / 2.0 * C;
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		
		quadrado = B * B;
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		
		retangulo = A * B;
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		sc.close();
	}

}
