class Produto {
  String produtoNome;
  String teorAlcoolico;
  String validade;

  public Produto() {
  }

  public Produto(String produtoNome, String teorAlcoolico, String validade) {
    this.produtoNome = produtoNome;
    this.teorAlcoolico = teorAlcoolico;
    this.validade = validade;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Nome: " + produtoNome + " " + "Teor alcoolico: " + teorAlcoolico + " " + "Validade: " + " " + validade;
  }

}
