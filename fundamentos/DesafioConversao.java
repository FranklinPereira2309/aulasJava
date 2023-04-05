package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário: ");
		String primeiro = entrada.next().replace(',','.');
		
		System.out.print("Digite o segundo salário: ");
		String segundo = entrada.next().replace(',', '.');
		
		System.out.print("nDigite o terceiro salário: ");
		String terceiro = entrada.next().replace(',', '.');
		
		double primeiroSalario = Double.parseDouble(primeiro);
		double segundoSalario = Double.parseDouble(segundo);
		double terceiroSalario = Double.parseDouble(terceiro);
		
		double somar = primeiroSalario + segundoSalario + terceiroSalario;
		
		System.out.println("A média salarial é: " + somar / 3);
		
		
		
		entrada.close();
		       
	}
}
