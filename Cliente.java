import java.util.ArrayList;

public class Cliente{
  protected String nome;
  protected String endereco;
  protected int telefone;
  protected String email;
  protected ArrayList<Contas> listaContasC;
  
  public Cliente(String nome, String endereco, int telefone, String email){
  listaContasC = new ArrayList<Conta>();
  this.nome = nome;
  this.endereco = endereco;
  this.telefone = telefone;
  this.email = email;
  }

  public String getNome() {
    return this.nome;
  }

  public String getEndereco() {
    return this.endereco;
  }
  public int getTelefone() {
    return this.telefone;
  }
  public String getEmail() {
    return this.email;
  }
  public ArrayList getContas() {
    return this.listaContasC;
  }

}
