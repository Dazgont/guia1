
public class ejercicio9 {
    public static int ProductoEscalar(int[] array1, int[] array2){
        int producto = 0;
        if (array1.length == 0 || array2.length == 0){
            throw new RuntimeException("Uno o ambos arrays estan vacios");
        }
        if(array1.length == array2.length){
            for (int i = 0; i < array1.length; i++){
                producto += array1[i] * array2[i];
        } 
    }
        else{
        throw new RuntimeException("las longitudes no son iguales");
    }
    return producto;

    
}
public static void main (String args[]){
    int[] array1 = {4,6,2};
    int[] array2 = {4, 5, 6};
    System.out.println("El producto escalar de los dos vectores es: " + ProductoEscalar(array1, array2));
}
}