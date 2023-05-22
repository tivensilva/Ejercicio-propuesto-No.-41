import java.util.List;

public class Calculadora {
    public static int encontrarMayor(List<Integer> numeros) {
        int max = Integer.MIN_VALUE;

        for (int numero : numeros) {
            if (numero > max) {
                max = numero;
            }
        }

        return max;
    }
}
