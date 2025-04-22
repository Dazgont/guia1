public class ejercicio15 {

    public static int estrictamenteCreciente(int[] arreglo) {
        if (arreglo.length == 0) {
            throw new RuntimeException("Error: El arreglo está vacío");
        }

        int contador = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] >= arreglo[i + 1]) { // Si no es estrictamente creciente
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        int[] arreglo1 = {1, 3, 5, 2, 4, 6, 8, 8, 9, 10};
        System.out.println("Arreglo 1: " + java.util.Arrays.toString(arreglo1));
        try {
            System.out.println("Número de rupturas: " + estrictamenteCreciente(arreglo1));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        int[] arreglo2 = {10, 20, 30, 40};
        System.out.println("\nArreglo 2: " + java.util.Arrays.toString(arreglo2));
        try {
            System.out.println("Número de rupturas: " + estrictamenteCreciente(arreglo2));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}