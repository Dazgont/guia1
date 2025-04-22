public class ejercicio14 {

    public static int[] intercalar(int[] arreglo, int entero) {
        if (arreglo.length == 0) {
            throw new RuntimeException("Error: El arreglo está vacío");
        }

        int n = arreglo.length - 1; 
        
   
        int posicion = 0;
        while (posicion < n && arreglo[posicion] < entero) {
            posicion++;
        }
        
 
        for (int i = n; i > posicion; i--) {
            arreglo[i] = arreglo[i - 1];
        }
        
        arreglo[posicion] = entero;
        
        return arreglo;
    }

    public static void main(String[] args) {

        int[] arreglo = {10, 20, 30, 0};
        int entero = 25;
        
        System.out.println("Arreglo antes: " + java.util.Arrays.toString(arreglo));
        
        try {
            int[] resultado = intercalar(arreglo, entero);
            System.out.println("Arreglo después: " + java.util.Arrays.toString(resultado));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}