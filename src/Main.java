import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        // Preguntar si el usuario quiere ingresar un número
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar un número?", "Ingreso de números", JOptionPane.YES_NO_OPTION);

        while (opcion == JOptionPane.YES_OPTION) {
            // Solicitar el número
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo"));
            numeros.add(numero);

            // Preguntar si desea ingresar otro número
            opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro número?", "Ingreso de números", JOptionPane.YES_NO_OPTION);
        }

        // Encontrar y mostrar el mayor número
        int max = Calculadora.encontrarMayor(numeros);
        JOptionPane.showMessageDialog(null, "El mayor número ingresado es: " + max);
    }
}
