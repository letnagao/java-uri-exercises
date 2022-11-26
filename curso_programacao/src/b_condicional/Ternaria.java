package b_condicional;

public class Ternaria {

	public static void main(String[] args) {

//		Usando a condicao ternaria:
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("O preco será: " + desconto);
		
//		Usando o if-else:
//		double preco = 34.5;
//		double desconto;
//		
//		if (preco < 20.0) {
//			desconto = preco * 0.1;
//		} else {
//			desconto = preco * 0.05;
//		}
//		System.out.println("O preco será: " + desconto);
	}
}
