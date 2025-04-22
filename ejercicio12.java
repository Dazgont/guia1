import java.util.Arrays;
public class ejercicio12 {

    public static void ordenar(int[] arreglo) {
        if (arreglo.length == 0) {
            throw new RuntimeException("Error: El arreglo está vacío");
        }

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Ejemplo único
        int[] numeros = {20, 5, 15, 10};
        
        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        
        try {
            ordenar(numeros); 
            System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}