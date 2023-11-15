package primeirasAulas;

public class HelloWorld {

    public static void main(String[] args) {
        int dadoTipoInt = 10;
        double dadoTipoDouble = 3.14;
        float dadoTipoFloat = 3.14f;
        long dadoTipoLong = 8789787897878787878L;
        String dadoTipoString = "Dado String";
        boolean dadoTipoBoolean = true;

        if (dadoTipoInt == 10) {
            System.out.println("É " + dadoTipoInt);
        } else {
            System.out.println("Não é " + dadoTipoInt);
        }

        int iWhile = 0;
        while (iWhile < 3) {
            System.out.println("Ainda é menor que 3");
            iWhile++;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Ainda é menor que 3");
        }

        int iDoWhile = 0;
        do {
            System.out.println("Adicionando numero ate chegar a 4");
            iDoWhile++;
            System.out.println(iDoWhile);
        } while (iDoWhile < 4);
    }

}