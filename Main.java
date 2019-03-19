package poo2;

public class Main {

	public static void main(String[] args) {
		Banco novoBanco = new Banco();
		novoBanco.criarContaCorrente("2255", 1250.50, 600);
		novoBanco.criarContaPoupanca("2254", 7000.38, 1000);
		
	}
}