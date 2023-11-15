package primeirasAulas;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Breno");
        nomes.add("Lucas");

        /*
         * for (String nome : nomes) {
         * System.out.println(nome);
         * }
         */

        // Outra forma de fazer o forEach a partir do Java 8.
        nomes.forEach(nome -> System.out.println(nome));
    }
}
