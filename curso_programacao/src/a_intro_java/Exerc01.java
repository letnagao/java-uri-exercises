package intro_java;
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		int x, y, z;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = x + y;
		System.out.println("SOMA = " + z);

		sc.close();
	}

}
