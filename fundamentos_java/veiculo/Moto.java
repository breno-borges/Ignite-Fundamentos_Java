package veiculo;

public class Moto implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Acelerando a moto");
    }

    @Override
    public void freiar() {
        System.out.println("Freiando a moto");
    }

}
