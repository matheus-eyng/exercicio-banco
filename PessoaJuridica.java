public class PessoaJuridica extends Cliente{
  private int cnpj;
  
  public PessoaJuridica(String nome, String endereco, int telefone, String email, int cnpj){
    super(nome, endereco, telefone, email);
    this.cnpj = cnpj;
  }

  public int getCnpj() {
    return this.cnpj;
  }
}
