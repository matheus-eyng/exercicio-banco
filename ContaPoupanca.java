package poo2;

public class ContaPoupanca extends Conta{
    protected int variacao;
    protected int rendimentoMensal;

    public ContaPoupanca(String numero, double saldo, double limite, int variacao, int rendimentoMensal, Cliente cliente, Agencia agencia) {
        super(numero, saldo, limite, cliente, agencia);
        this.variacao = variacao;
        this.rendimentoMensal = rendimentoMensal;
    }

    public int retornaVariacao() {
        return variacao;
    }

    public int retornaRendimentoMensal() {
        return rendimentoMensal;
    }

}
