import java.util.Scanner;
import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
    int menu = 0;
    Scanner input = new Scanner(System.in);
    
    Cliente carlos = new Cliente("Carlos", "1234", "1234", "1234");
    Cliente joao = new Cliente("Joao", "1234", "1234", "1234");
    
    ArrayList<Cliente> clientes = new ArrayList<>();
    
    clientes.add(carlos);
    clientes.add(joao);

    Cliente cliente = new Cliente();

    while (menu != 4) {
      System.out.println("\nMenu Principal\n");
      System.out.println(" 1) Listar clientes\n");
      System.out.println(" 2) Cadastrar novo cliente\n");
      System.out.println(" 3) Cadastrar novo produto\n");
      System.out.println(" 4) Sair\n");

      menu = input.nextInt();

      switch (menu) {
        case 1:
          clientes.forEach((value) -> System.out.println(value.toString()));
          break;
        case 2:
          System.out.println("Digite seu nome: ");
          String nome = input.next();
          System.out.println("Digite seu cpf: ");
          String cpf = input.next();
          System.out.println("Digite seu telefone: ");
          String telefone = input.next();
          System.out.println("Digite seu endereço: ");
          String endereco = input.next();

          Cliente NovoCliente = new Cliente(nome, cpf, telefone, endereco);
          clientes.add(NovoCliente);

          break;
        case 4:
          System.out.print("Programa encerrado");
          menu = 4;
          break;
        default:
          System.out.println("default ");
          break;
      }
    }
          input.close();

  }
}