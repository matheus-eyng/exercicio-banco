import java.util.ArrayList;

public class Agencia{
  protected int numero;
  protected String nome;
  protected String endereco;
  protected ArrayList<Clientes> listaClientesA;
  protected ArrayList<Conta> listaContasA;
  
  public Agencia(int numero, String nome, String endereco){
     listaContasA = new ArrayList<Conta>();
     listaClientes = new ArrayList<Cliente>();
     this.numero = numero;
     this.nome = nome;
     this.endereco = endereco;
  }

  public int getNumero() {
    return this.numero;
  }

  public String getEnderco() {
    return this.endereco;
  }

  public ArrayList getClientes() {
    return this.listaClientesA;
  }

  public ArrayList getContas() {
    return this.listaContasA;
  }

  public void adicionarCliente(Clientes cliente) {
    listaClientesA.add(cliente);
  }

  public void adicionarConta(Conta conta) {
    listaContasA.add(conta);
  }

}
