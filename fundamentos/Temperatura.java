package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		var tempF = 86;
		final var ajuste = 32;

		final var fator = 5.0 / 9;

		var celsius = (tempF - ajuste) * fator;
		System.out.println("A temperatura é: " + celsius + "°C");
	}

}
