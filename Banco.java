package poo2;
import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> listaContas;
    private static int numeroContas;
    
    public Banco() {
        listaContas = new ArrayList<Conta>();
    }
    
    public void criarContaCorrente(String numero, double saldo, double limite){
        Conta novaContaCorrente = new Conta(numero, saldo, limite);
        listaContas.add(novaContaCorrente);
        numeroContas++;
    }
   
    public void criarContaPoupanca(String numero, double saldo, double limite){
        Conta novaContaPoupanca = new Conta(numero, saldo, limite);
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
            double novoSaldo = contaReferenciada.retornaSaldo() + valor;
            contaReferenciada.adicionaMovimentacao(novoMovimento);

            if (contaReferenciada.retornaNumeroConta() == conta) {
                contaReferenciada.setSaldo(novoSaldo);
            }
        }
    }

    public void fazerSaque(String conta, double valor) {

        Movimentacao novoMovimento = new Movimentacao("deposito", valor, 'D');
        for (int i = 0; i < numeroContas; i++) {
            Conta contaReferenciada = listaContas.get(i);
            double novoSaldo = contaReferenciada.retornaSaldo() - valor;
            double limiteSaque = contaReferenciada.retornaLimiteDeSaque();
            contaReferenciada.adicionaMovimentacao(novoMovimento);

            if (contaReferenciada.retornaNumeroConta() == conta && limiteSaque >= valor) {
                contaReferenciada.setSaldo(novoSaldo);
            }
        }

    }
    
    // TODO: imprimir comprovante

}