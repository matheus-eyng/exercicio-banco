public class Agencia{
  protected int numero;
  protected String nome;
  protected String endereco;
  protected ArrayList<Clientes> listaClientesA;
  protected ArrayList<Conta> listaContasA;
  protected static int numeroClientesA;
  protected static int numeroContasA;
  
  
  public class Agencia(int numero, String nome, String endereco){
     listaContasA = new ArrayList<Conta>();
     listaClientes = new ArrayList<Cliente>();
     this.numero = numero;
     this.nome = nome;
     this.endereco = endereco;
  }
}
