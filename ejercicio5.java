public class ejercicio5{
    public static void main(String[] args){
    boolean[] array1 = { false, true, true, false, false, false,
    
    true, true, false };
    
    boolean[] array2 = { true, false, true, true, true, false,
    false, true, true };
    
    System.out.println("Resultado: ");
    boolean[] arrayDev = mezclarArreglos(array1, array2);
    for (int i = 0; i < arrayDev.length; i++){
    System.out.println(arrayDev[i] ? "true" : "false");
    }
    }
    public static boolean[] mezclarArreglos(boolean[] array1, boolean[]
    array2){
    
    if (array1.length == 0 || array2.length == 0){
    throw new RuntimeException("No elements in one of the arrays");
    }
    if (array1.length != array2.length){
    throw new RuntimeException("Different lengths in the arrays");
    }
    boolean[] arrayDev = new boolean[ array1.length ];
    for (int i = 0; i < array1.length; i++){
    if (i % 2 == 1){
    arrayDev[i] = array1[i];
    }
    if (i % 2 == 0){
    arrayDev[i] = array2[i];
    }
    }
    return arrayDev;
    }
    }