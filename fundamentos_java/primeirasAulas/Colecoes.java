package primeirasAulas;

import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Breno", 10);
        notas.put("Lucas", 10);

        var nota = notas.get("Breno");
        System.out.println(nota);

        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Chave: " + key + "Value: " + value);
        }
    }
}
