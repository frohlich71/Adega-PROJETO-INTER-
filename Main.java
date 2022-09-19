import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int menu = 0;
        Scanner input = new Scanner(System.in);

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
                // Aceita overbook!
                cliente.display();
                
                System.out.print("Lista de clientes ");
                break;
            case 2:
                System.out.print("case2 ");
                break;
            case 3:
                System.out.print("case3 ");
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
    

    

    // System.out.println("Teste: ");

    // String nome = teclado.next();
    // String cpf = teclado.next();
    // String telefone = teclado.next();
    // String endereco = teclado.next();

    // teclado.close();

    // clientes[2] = new Cliente(3, nome, cpf, telefone, endereco);

    // clientes[2].display();

    

  }
}