import java.util.Arrays;

public class ejercicio13 {

    public static int busquedaB(int[] arreglo, int entero) {
        if (arreglo.length == 0) {
            throw new RuntimeException("Error: El arreglo está vacío");
        }
        
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            
            if (arreglo[medio] == entero) {
                return medio; 
            } else if (arreglo[medio] < entero) {
                izquierda = medio + 1; 
            } else {
                derecha = medio - 1; 
            }
        }
        
        return -1; 
    }

    public static void main(String[] args) {
        
        int[] arregloOrdenado = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int enteroBuscado = 23;
        
        System.out.println("Arreglo ordenado: " + Arrays.toString(arregloOrdenado));
        
        try {
            int posicion = busquedaB(arregloOrdenado, enteroBuscado);
            if (posicion != -1) {
                System.out.println("El entero " + enteroBuscado + " se encuentra en la posición: " + posicion);
            } else {
                System.out.println("El entero " + enteroBuscado + " no está en el arreglo");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
