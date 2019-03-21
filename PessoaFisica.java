public class PessoaFisica extends Cliente{
  private int cpf;
  private String estadoCivil;
  
  public PessoaFisica(String nome, String endereco, int telefone, String email, int cpf, String estadoCivil){
    super(nome, endereco, telefone, email);
    this.cpf = cpf;
    this.estadoCivil = estadoCivil;
  }

  public int getCpf() {
    return this.cpf;
  }

  public String getEstadoCivil() {
    return this.estadoCivil;
  }
}
