package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		// System.out.print("Bom");
		// System.out.print(" dia!\n\n");

		// System.out.println("Bom");
		// System.out.println("dia!!");

		// System.out.printf("Números sorteados: %d, %d, %d, %d, %d, %d", 33, 28, 02,
		// 15, 59, 34);

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu Nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine(); //para capturar o /n no comando anterior

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.printf("%s %s tem %d anos de idade!", nome, sobrenome, idade);
		entrada.close();
	}
}
