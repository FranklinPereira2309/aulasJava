package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//tipos numericos
		byte anosDeEmpresa = 23; //127
		short numerosDeVoos = 542; //32767
		int id = 2_134_845_223;
		long pontosAcumulados = 3_134_845_223L;
		
		//tipos númericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false;
		
		//tipo caractere
		char status = 'A';
		
		//Dias de empresa
		
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numerosDeVoos / 2);
		
		//pontos por real
		
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
