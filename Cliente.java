public class Cliente{
  protected String nome;
  protected String endereo;
  protected int telefone;
  protected String email;
  protected ArrayList<Contas> listaContasC;
  protected static int numeroContasC;
  
  public class Cliente(String nome, String endereco, int telefone, String email){
  listaContasC = new ArrayList<Conta>();
  this.nome = nome;
  this.endereco = endereco;
  this.telefone = telefone;
  this.email = email;
  this.numeroContasC = 0;
  
  
  }
}
