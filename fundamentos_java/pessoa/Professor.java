package pessoa;

public class Professor extends Pessoa {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String imprimirDadosPessoa() {
        System.out.println(super.imprimirDadosPessoa());
        return "O salário é " + salario;
    }
}