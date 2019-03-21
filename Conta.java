package poo2;
import java.util.ArrayList;

public class Conta {
    protected String numeroConta;
    protected double saldoConta;
    protected double limiteDeSaque;
    protected ArrayList<Movimentacao> listaMovimentos;
    
    public Conta (String numero, double saldo, double limite) {
        this.numeroConta = numero;
        this.saldoConta = saldo;
        this.limiteDeSaque = limite;
        listaMovimentos = new ArrayList<Movimentacao>();
    }

    public double retornaSaldo() {
        return saldoConta;
    }

    public String retornaNumeroConta() {
        return numeroConta;
    } 
    
    public double retornaLimiteDeSaque() {
        return limiteDeSaque;
    }

    public void setSaldo(double saldo) {
        this.saldoConta = saldo;
    }
   
    public void setLimiteDeSaque(double limite) {
        this.limiteDeSaque = limite;
    }

    public void adicionaMovimentacao(Movimentacao movimento) {
        listaMovimentos.add(movimento);
    }
}
	