package d_other_basic_topics;

public class IntroStringFunctions {

	public static void main(String[] args) {
//		Formatar: toLowerCase(), toUpperCase(), trim()
//		Recortar: substring(inicio), substring(inicio,fim)
//		Substituir: Replace(char,char), Replace(string,string)
//		Buscar: IndexOf, LastIndexOf
//		str.Split("")
		
		String original = "asSADhdsAauSAdh";
		
		String s01 = original.toLowerCase();
		System.out.println(s01);
		
		String s02 = original.toUpperCase();
		System.out.println(s02);
		
		String s03 = original.trim();
		System.out.println(s03);
		
		String s04 = original.substring(2);
		System.out.println(s04);
		
		String s05 = original.replace('a', 'x');
		System.out.println(s05);
	}
}
