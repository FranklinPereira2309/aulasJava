package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal!".charAt(8));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var salario = 12354.987;
		var idade = 33;
		System.out.println(nome + " " + sobrenome);
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome);
		System.out.printf("O Sr. %s %s tem %d de idade e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		System.out.println("\n");
		String frase = String.format("O Sr. %s %s tem %d anos de idade e ganha R$ %.2f de salário", nome, sobrenome,
				idade, salario);

		System.out.println(frase);

		System.out.println("O menino partiu para o além".contains("para"));
		System.out.println("O menino partiu para o além".indexOf("para"));
		System.out.println("O menino partiu para o além".substring(16));
		System.out.println("O menino partiu para o além".substring(16, 20));

	}
}
