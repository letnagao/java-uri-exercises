package c_repetitive_structures;

import java.util.Scanner;

public class IntroFor {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		
//		int soma = 0;
//		for (int i=0; i<N; i++) {
//			System.out.println("Valor de i: " + i);
//			int x = sc.nextInt();
//			soma += x;
//		}
//		
//		System.out.println(soma);
//		
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		
		int x = 3;
		int y = 0;
		
		for (int i=0; i<x; i++) {
			System.out.print(i + ",");
			y = y + 5;
			System.out.println(y);
		}
		sc.close();
	}
}
