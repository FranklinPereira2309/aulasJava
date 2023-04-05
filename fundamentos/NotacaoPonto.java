package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X"
				.replace("X","Senhor")
				.toUpperCase()
				.concat("!!!");
		/*s = s.replace("X", "Senhor");
		s = s.toUpperCase();
		s = s.concat("!!!");*/
		
		//Tipos primitivos não tem o operador "."
		
		System.out.println(s);
		
		System.out.println("franklin".toUpperCase());
	}
}
