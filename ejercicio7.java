public class ejercicio7{
    public static void main(String[] args){
    int[] array1 = { 8, 6, 2, 11, 5 };
    System.out.println("Resultado: ");
    int[] arrayDev = reverso(array1);
    for (int i = 0; i < arrayDev.length; i++){
    System.out.println(arrayDev[i]);
    }
    }
    public static int[] reverso(int[] array){
    if (array.length == 0){
    throw new RuntimeException("No elements in array");
    }
    int[] arrayDev = new int[ array.length ];
    for (int i = 0; i < array.length; i++){
    arrayDev[i] = array[array.length - i - 1];
    }
    return arrayDev;
    }
    }