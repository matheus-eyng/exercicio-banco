package poo2;
import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> listaContas;
    private static int numeroContas;
    
    public Banco() {
        listaContas = new ArrayList<Conta>();
    }
    
    public void criarContaCorrente(String numero, double saldo, double limite, double limiteCheque, boolean usandoCheque){
        Conta novaContaCorrente = new ContaCorrente(numero, saldo, limite, limiteCheque, usandoCheque);
        listaContas.add(novaContaCorrente);
        numeroContas++;
    }
   
    public void criarContaPoupanca(String numero, double saldo, double limite, int variacao, int rendimentoMensal){
        Conta novaContaPoupanca = new ContaPoupanca(numero, saldo, limite, variacao, rendimentoMensal);
        listaContas.add(novaContaPoupanca);
        numeroContas--;
    }

    public void excluirConta(Conta contaParaExcluir) {
        listaContas.remove(contaParaExcluir);
    }

    public void fazerDeposito(String conta, double valor) {
        Movimentacao novoMovimento = new Movimentacao("deposito", valor, 'D');
        for (int i = 0; i < numeroContas; i++) {
            Conta contaReferenciada = listaContas.get(i);
            if (contaReferenciada.retornaNumeroConta() == conta) {
                double novoSaldo = contaReferenciada.retornaSaldo() + valor;
                contaReferenciada.adicionaMovimentacao(novoMovimento);               contaReferenciada.setSaldo(novoSaldo);

            }
        }
    }

    public void fazerSaque(String conta, double valor) {
        Movimentacao novoMovimento = new Movimentacao("deposito", valor, 'D');
        for (int i = 0; i < numeroContas; i++) {
            double limiteSaque = contaReferenciada.retornaLimiteDeSaque();

            if (contaReferenciada.retornaNumeroConta() == conta && limiteSaque >= valor) {
                contaReferenciada.setSaldo(novoSaldo);
                Conta contaReferenciada = listaContas.get(i);
                double novoSaldo = contaReferenciada.retornaSaldo() - valor;
                contaReferenciada.adicionaMovimentacao(novoMovimento);
            }
        }

    }
    
    public void imprimeComprovante(String conta) {
        for (int i = 0; i < numeroContas; i++) {
            Conta contaReferenciada = listaContas.get(i);

            if (contaReferenciada.retornaNumeroConta() == conta) {
                
            }
        }

    }

}
