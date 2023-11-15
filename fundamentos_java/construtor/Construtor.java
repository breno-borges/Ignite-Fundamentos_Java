package construtor;

public class Construtor {
    private int numero;

    public Construtor() {
    }

    public Construtor(int numero) {
        this.numero = numero;
        System.out.println("Numero informado é o " + this.numero);
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

}
