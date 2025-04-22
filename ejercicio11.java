public class ejercicio11 {

    public static int busquedaL(int[] arreglo, int entero) {
        if (arreglo.length == 0) {
            throw new RuntimeException("Error: El arreglo está vacío");
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == entero) {
                return i; 
            }
        }
        throw new RuntimeException("Error: " + entero + " no está en el arreglo");
    }

    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20};
        int buscado = 15; 
        
        try {
            int posicion = busquedaL(numeros, buscado);
            System.out.println(buscado + " encontrado en la posición: " + posicion);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}