package excecoes;

import pessoa.Pessoa;

public class Excecoes {
    public static void main(String[] args) {
        /*
         * try {
         * validarNumero();
         * } catch (Exception e) {
         * System.out.println("Deu ruim");
         * e.printStackTrace();
         * }
         */

        Pessoa p = null;
        p.getCpf();
    }

    public static void validarNumero() throws Exception {
        int numero = 10;

        if (numero < 100) {
            throw new Exception("Numero menor que 100");
        }
    }
}
