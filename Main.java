import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    Cliente[] clientes = new Cliente[50];

    clientes[0] = new Cliente(1, "Carlos", "123", "234", "54323");
    clientes[1] = new Cliente(2, "Mateus", "123", "234", "54323");

    System.out.println("Teste: ");

    String nome = teclado.next();
    String cpf = teclado.next();
    String telefone = teclado.next();
    String endereco = teclado.next();

    teclado.close();

    clientes[2] = new Cliente(3, nome, cpf, telefone, endereco);

    clientes[2].display();

    

  }
}