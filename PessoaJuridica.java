public Class PessoaJuridica extends Cliente{
  private int cnpj;
  
  public class PessoaJuridica(String nome, String endereco, int telefone, String email, int cnpj){
    super(nome, endereco, telefone, email);
    this.cnpj = cnpj;
  }
}
