package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		/*int denA = 3*2;
		int denB = 2;
		int numA = (int) Math.pow(6*(3+2), 2);
		int numB = (int) Math.pow((1-5)*(2-7) / denB,2) ;
		int superiorA = numA / denA;
		int superiorB = numB;
		int superior = (int) Math.pow(superiorA - superiorB,3);
		int inferior = (int) Math.pow(10, 3);
		int desafio = superior / inferior;*/
		
		double denA = 3 * 2;
		double numA = Math.pow(6*(3+2), 2);
		double superiorA = numA / denA;
		
		double numB = (1-5) * (2-7);
		double denB = 2;
		
		double superiorB = Math.pow(numB/denB, 2);
		
		double superior = Math.pow( superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println(resultado);
		
		
	}
}
