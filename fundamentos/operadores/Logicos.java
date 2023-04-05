package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("Tebala verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true); //codigo morto
		//System.out.println(false && false); //codigo morto
		
		System.out.println("\nTabela verdade OU (OR)");
		//System.out.println(true || true); //codigo morto
		//System.out.println(true || false); //codigo morto
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(false ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
		
	}
}
