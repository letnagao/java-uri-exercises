package if_else;

import java.util.Scanner;

public class IfElseExercise {

	public static void main(String[] args) {
		
		int hora;
		
		Scanner sc = new Scanner(System.in);
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		}
		else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
		sc.close();
	}
}
