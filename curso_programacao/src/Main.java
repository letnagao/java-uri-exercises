import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		String product1 = "Computer";
//		String product2 = "Office desk";
//
//		int age = 30;
//		int code = 5444;
//		char gender = 'F';
//		
//		double price1 = 2100.0;
//		double price2 = 650.50;
//		double measure = 53.234567;
//		
//		Locale.setDefault(Locale.US);
//		System.out.printf("Computer, which price is $ %.2f%n", price1);
//		System.out.printf("Office desk, which price is $ %.2f%n", price2);
//		System.out.println();
//		System.out.printf("Record: %d years old, code %d and gender: %b", age, code, gender);
//		System.out.println();
//		System.out.println();
//		System.out.printf("Measue with eight decimal places: %f%n", measure);
//		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
//		System.out.printf("US decimal point: %f", measure);

//		int a, b;
//		double resultado;
//		
//		a = 5;
//		b = (int) a;
//		
//		resultado = (double) a / b;
//		
//		System.out.println(resultado);
		
//		Scanner sc = new Scanner(System.in);
//		
//		String x;
//		System.out.println("Digite algo: ");
//		x = sc.next();
//		System.out.println("Voce digitou: " + x);
//		
//		int y;
//		System.out.println("Digite um numero inteiro: ");
//		y = sc.nextInt();
//		System.out.println("Voce digitou: " + y);
//		
//		Locale.setDefault(Locale.US);
//		
//		double z;
//		System.out.println("Digite um numero com virgula: ");
//		z = sc.nextDouble();
//		System.out.println("Voce digitou: " + z);
//
//		char u;
//		System.out.println("Digite algo : ");
//		u = sc.next().charAt(0);
//		System.out.println("Voce digitou: " + u);
//		
//		sc.close();
		
//		Scanner sc = new Scanner(System.in);
//
//		String x;
//		int y;
//		double z;
//		x = sc.next();
//		y = sc.nextInt();
//		z = sc.nextDouble();
//		System.out.println("Dados digitados: ");
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
