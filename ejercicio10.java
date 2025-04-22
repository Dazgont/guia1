public class ejercicio10 {
    
    public static int productoEscalarConInverso(int[] array1, int[] array2) {
        int producto = 0;
        if (array1.length == 0 || array2.length == 0) {
            throw new RuntimeException("Uno o ambos arrays están vacíos");
        }
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                producto += array1[i] * array2[array2.length - 1 - i];
            }
        } else {
            throw new RuntimeException("Las longitudes no son iguales");
        }
        return producto;
    }

    public static void main(String[] args) {
        int[] array1 = {4, 6, 2};
        int[] array2 = {4, 5, 6};
        
        int resultado = productoEscalarConInverso(array1, array2);
        System.out.println("El producto escalar con inverso es: " + resultado);
    }
}