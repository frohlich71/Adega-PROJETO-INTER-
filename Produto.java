class Produto {
  String produtoNome;
  String teorAlcoolico;
  String validade;
  double preco;

  public Produto() {
  }

  public Produto(String produtoNome, String teorAlcoolico, String validade, double preco) {
    this.produtoNome = produtoNome;
    this.teorAlcoolico = teorAlcoolico;
    this.validade = validade;
    this.preco = preco;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Nome: " + produtoNome + " " + "Teor alcoolico: " + teorAlcoolico + " " + "Validade: " + " " + validade +
    "Preço: R$" + preco;
  }

}
