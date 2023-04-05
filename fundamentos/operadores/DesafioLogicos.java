package fundamentos.operadores;

public class DesafioLogicos {
	public static <bollean> void main(String[] args) {

		// Tv de 32'
		boolean trabalho1 = true;
		boolean trabalho2 = true;

		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou a TV de 50\"? " + comprouTV50);
		System.out.println("Comprou a TV de 32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete ? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
		
	}
}
