package poo2;

public class Main {

	public static void main(String[] args) {
		Banco novoBanco = new Banco();
		novoBanco.criarContaCorrente("3314", 25000.32, 12000, 950, false);
		novoBanco.criarContaPoupanca("3314", 70000, 15000, 51, 5);
	}
}