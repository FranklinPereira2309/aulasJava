package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		String s1 = new String("2");
		
		System.out.println("2" == s1); //false
		System.out.println("2".equals(s1)); //true
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();
		
		System.out.println("2" == s2); //false
		System.out.println("2".equals(s2.trim())); //true
		System.out.println("2".equals(s2)); //false
		
		
		entrada.close();
	}
}
