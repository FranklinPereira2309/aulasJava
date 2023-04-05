package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		double num1 = entrada.nextDouble();
		System.out.print("Digite o segundo numero: ");
		double num2 = entrada.nextDouble();
		System.out.print("Digite a operacao desejada(+,-,*,/,%)? ");
		String op = entrada.next();
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		entrada.close();
		
	}
}
