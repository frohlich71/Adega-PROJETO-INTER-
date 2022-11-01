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

    Cliente cliente = new Cliente();

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

        case 3:
          System.out.println("Digite o nome do produto: ");
          String produtoNome = input.next();
          System.out.println("Digite o teor alcolico do produto: ");
          String teorAlcoolico = input.next();
          System.out.println("Digite a validade do produto: ");
          String validade = input.next();
          System.out.println("Digite o preço do produto: ");
          double preco = input.nextDouble();

          Produto NovoProduto = new Produto(produtoNome, teorAlcoolico, validade, preco);
          produtos.add(NovoProduto);

          break;

        case 6:

          clientes.forEach((value) -> System.out.println(value.toString()));

          System.out.println("Digite qual cliente deseja remover: ");
          int cliente_para_remover = input.nextInt();

          clientes.remove(cliente_para_remover - 1);

          break;

        case 7:

          produtos.forEach((value) -> System.out.println(value.toString()));

          System.out.println("Digite qual produto deseja remover: ");
          int produto_para_remover = input.nextInt();

          produtos.remove(produto_para_remover - 1);

          break;

        case 8:

          funcionarios.forEach((value) -> value.imprimeDados());

          System.out.println("Digite qual funcionario deseja remover: ");
          int funcionario_para_remover = input.nextInt();

          funcionarios.remove(funcionario_para_remover - 1);

          break;

        case 9:
          produtos.forEach((value) -> System.out.println(value.toString()));

          break;

        case 4:
          System.out.println("Digite o nome do funcionario: ");
          String NovoNome = input.next();
          System.out.println("Digite a mátricula do funcionario: ");
          int NovaMatricula = input.nextInt();
          System.out.println("Digite o salario: ");
          double NovoSalario = input.nextDouble();
          System.out.println("Cargo: \n 1) Gerente \n 2) Vendedor");
          int cargo = input.nextInt();

          if(cargo == 1) {
            
            Gerente NovoGerente = new Gerente(NovoNome, NovaMatricula, NovoSalario);
            funcionarios.add(NovoGerente);
          } else if(cargo == 2) {
            
            Vendedor NovoVendedor = new Vendedor(NovoNome, NovaMatricula, NovoSalario, 0);
            funcionarios.add(NovoVendedor);
          }
          break;

        case 5:
          funcionarios.forEach((value) -> value.imprimeDados());
          break;

        case 10:
          System.out.print("Programa encerrado");
          menu = 10;
          break;

        default:
          System.out.println("default ");
          break;
      }
    }
    input.close();

  }
}