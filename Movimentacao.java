package poo2;

public class Movimentacao {
    private String descricao;
    private double valor;
    private char DepositoSaque; // D para deposito S para saque

    public Movimentacao(String descricao, double valor, char DepositoSaque) {
        this.descricao = descricao;
        this.valor = valor;
        this.DepositoSaque = DepositoSaque;
    }
}
