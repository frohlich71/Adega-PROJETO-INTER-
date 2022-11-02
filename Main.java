import java.util.Scanner;
import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
    int menu = 0;
    Scanner input = new Scanner(System.in);

    Cliente carlos = new Cliente("Carlos", "1234", "1234", "1234");
    Cliente joao = new Cliente("Joao", "1234", "1234", "1234");
    Produto Whisky = new Produto("Jack daniels", "30%", "10/05/2022", 120);
    Gerente Cesar = new Gerente("Cesar mennoti", 12345, 2000);

    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Produto> produtos = new ArrayList<>();
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    produtos.add(Whisky);
    clientes.add(carlos);
    clientes.add(joao);
    funcionarios.add(Cesar);

    while (menu != 10) {
      System.out.println("\nMenu Principal\n");
      System.out.println(" 1) Listar clientes\n");
      System.out.println(" 2) Cadastrar novo cliente\n");
      System.out.println(" 3) Cadastrar novo produto\n");
      System.out.println(" 4) Cadastrar novo funcionario\n");
      System.out.println(" 5) Listar funcionarios\n");
      System.out.println(" 6) Remover clientes\n");
      System.out.println(" 7) Remover Produtos\n");
      System.out.println(" 8) Remover funcionarios\n");
      System.out.println(" 9) Listar Produtos\n");
      System.out.println(" 10) Sair\n");

      menu = input.nextInt();

      switch (menu) {
        case 1 -> clientes.forEach((value) -> System.out.println(value.toString(clientes.indexOf(value))));
        case 2 -> {
          String sacrificio = input.nextLine();
          System.out.println("Digite seu nome e sobrenome: ");
          String nome = input.nextLine();
          System.out.println("Digite seu cpf: ");
          String cpf = input.nextLine();
          System.out.println("Digite seu telefone: ");
          String telefone = input.nextLine();
          System.out.println("Digite seu endereço: ");
          String endereco = input.nextLine();
          Cliente NovoCliente = new Cliente(nome, cpf, telefone, endereco);
          clientes.add(NovoCliente);
        }
        case 3 -> {
          String sacrificio = input.nextLine();
          System.out.println("Digite o nome do produto: ");
          String produtoNome = input.nextLine();
          System.out.println("Digite o teor alcolico do produto: ");
          String teorAlcoolico = input.nextLine();
          System.out.println("Digite a validade do produto: ");
          String validade = input.nextLine();
          System.out.println("Digite o preço do produto: ");
          double preco = input.nextDouble();
          Produto NovoProduto = new Produto(produtoNome, teorAlcoolico, validade, preco);
          produtos.add(NovoProduto);
        }
        case 6 -> {
          clientes.forEach((value) -> System.out.println(value.toString(clientes.indexOf(value))));
          System.out.println("Digite qual cliente (ID) deseja remover: ");
          int cliente_para_remover = input.nextInt();
          clientes.remove(cliente_para_remover - 1);
        }
        case 7 -> {
          produtos.forEach((value) -> System.out.println(value.toString(produtos.indexOf(value))));
          System.out.println("Digite qual produto (ID) deseja remover: ");
          int produto_para_remover = input.nextInt();
          produtos.remove(produto_para_remover - 1);
        }
        case 8 -> {
          funcionarios.forEach((value) -> value.imprimeDados(funcionarios.indexOf(value)));
          System.out.println("Digite qual funcionario (ID) deseja remover: ");
          int funcionario_para_remover = input.nextInt();
          funcionarios.remove(funcionario_para_remover - 1);
        }
        case 9 -> produtos.forEach((value) -> System.out.println(value.toString(produtos.indexOf(value))));
        case 4 -> {
          String sacrificio = input.nextLine();
          System.out.println("Digite o nome do funcionario: ");
          String NovoNome = input.nextLine();
          System.out.println("Digite a mátricula do funcionario: ");
          int NovaMatricula = input.nextInt();
          System.out.println("Digite o salario: ");
          double NovoSalario = input.nextDouble();
          System.out.println("Cargo: \n 1) Gerente \n 2) Vendedor");
          int cargo = input.nextInt();
          if (cargo == 1) {

            Gerente NovoGerente = new Gerente(NovoNome, NovaMatricula, NovoSalario);
            funcionarios.add(NovoGerente);
          } else if (cargo == 2) {

            Vendedor NovoVendedor = new Vendedor(NovoNome, NovaMatricula, NovoSalario, 0);
            funcionarios.add(NovoVendedor);
          }
        }
        case 5 -> funcionarios.forEach((value) -> value.imprimeDados(funcionarios.indexOf(value)));
        case 10 -> System.out.print("Programa encerrado");
        default -> System.out.println("default ");
      }
    }
    input.close();

  }
}