class Produto {
  String produtoNome;
  String teorAlcoolico;
  String validade;
  double preco;

  public Produto(String produtoNome, String teorAlcoolico, String validade, double preco) {
    this.produtoNome = produtoNome;
    this.teorAlcoolico = teorAlcoolico;
    this.validade = validade;
    this.preco = preco;
  }

  public String toString(int idArray) {
    // TODO Auto-generated method stub
    return  "ID: "  + (idArray +1 ) + "\nNome: " + produtoNome + " " + "\nTeor alcoolico: " + teorAlcoolico + " " + "\nValidade: " + " " + validade +
    "\nPreço: R$" + preco;
  }

}
