package veiculo;

public class TesteDeVeiculo {

    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        carro.acelerar();
        moto.acelerar();
        carro.freiar();
        carro.acelerar();
    }
}
