package conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.setNumero("1234-7");
        c1.setTitular("Breno");

        c1.depositar(50);
        c1.sacar(150);
    }
}
