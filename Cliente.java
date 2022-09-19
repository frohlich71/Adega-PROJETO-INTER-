import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cliente {
  String Id;
  String nome;
  String cpf;
  String endereco;
  String telefone;

  Cliente() {
  }

  Cliente(String i, String n, String c, String e, String t) {
    this.Id = i;
    this.nome = n;
    this.cpf = c;
    this.endereco = e;
    this.telefone = t;

  }

  @Override
  public String toString() {
    return "Nome: " + nome + " " + "CPF: " + cpf + " " + "Endereço: " + " " + endereco;
  }

  public void display() {
    Cliente carlos = new Cliente("4", "Carlos", "1234", "1234", "1234");
    Cliente joao = new Cliente("4", "Joao", "1234", "1234", "1234");

    ArrayList<Cliente> clientes = new ArrayList<>();

    clientes.add(carlos);
    clientes.add(joao);

    clientes.forEach((cliente) -> System.out.println(cliente.toString()));

  }
}