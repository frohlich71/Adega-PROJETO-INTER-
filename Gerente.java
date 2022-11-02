public class Gerente extends Funcionario {
  private double salario;

  public Gerente(String nome, int matricula, double salarioBase) {
    super(nome, matricula, salarioBase);

    setSalario(salarioBase);
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  @Override
  public void imprimeDados(int IdArray) {
    String nome = super.getNome();
    int matricula = super.getMatricula();
    this.calculaSalario();
    double salario = this.getSalario();

    System.out.println( "ID: "+ (IdArray +1) +"\nNome: " + nome + "\nMatricula: "+ matricula + "\nSalario: " + salario);
  }

  @Override
  public void calculaSalario() {

    double salarioBase = super.getSalarioBase();
    this.salario = salarioBase * 2;

  }
}
