class Cliente {
  int Id;
  String nome;
  String cpf;
  String endereco;
  String telefone;

  Cliente() {
  }

  Cliente(int i, String n, String c, String e, String t) {
    this.Id = i;
    this.nome = n;
    this.cpf = c;
    this.endereco = e;
    this.telefone = t;

  }

  public void display() {
    System.out.println("Customer id is: " + nome + " "
        + "and Customer name is: "
        + nome);
  }
}