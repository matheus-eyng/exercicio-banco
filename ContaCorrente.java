package poo2;

public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;
    private boolean usandoChequeEspecial;

    public ContaCorrente (String numero, double saldo, double limite, double saldoConta, double limiteCheque, boolean usandoCheque, Cliente cliente, Agencia agencia){
        super(numero, saldo, limite, cliente, agencia);
        this.limiteChequeEspecial = limiteCheque;
        this.usandoChequeEspecial = usandoCheque;

    }

    protected double retornaLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    protected boolean retornaUsandoChequeEspecial() {
        return usandoChequeEspecial;
    }
    

}
