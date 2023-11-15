package conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + ". Saldo atual de R$" + saldo);
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + ". Saldo atual de R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para o valor solicitado.");
        }
    }
}
