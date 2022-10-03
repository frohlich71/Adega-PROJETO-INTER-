import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

  @Override
  public String toString() {
    return "Nome: " + nome + " " + "CPF: " + cpf + " " + "Endereço: " + " " + endereco;
  }

  // public void display() {
  // Cliente carlos = new Cliente("Carlos", "1234", "1234", "1234");
  // Cliente joao = new Cliente("Joao", "1234", "1234", "1234");

  // ArrayList<Cliente> clientesAntigos = new ArrayList<>();

  // clientesAntigos.add(carlos);
  // clientesAntigos.add(joao);

  // clientesAntigos.forEach((cliente) -> System.out.println(cliente.toString()));

  // }
}