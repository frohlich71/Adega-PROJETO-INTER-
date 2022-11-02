class Cliente {
  String nome;
  String cpf;
  String endereco;
  String telefone;

  Cliente() {
  }

  Cliente(String n, String c, String e, String t) {
    this.nome = n;
    this.cpf = c;
    this.endereco = e;
    this.telefone = t;

  }

  public String toString(int idArray) {
    return "ID: " + (idArray + 1) + "\nNome: " + nome + " " + "\nCPF: " + cpf + " " + "\nEndereço: " + " " + endereco;
  }
}