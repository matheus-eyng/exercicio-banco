package poo2;

public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;
    private boolean usandoChequeEspecial;

    public ContaCorrente (String numero, double saldo, double limite, double saldoConta, double limiteCheque, boolean usandoCheque) {
        super(numero, saldo, limite);
        this.saldoConta = saldoConta;
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