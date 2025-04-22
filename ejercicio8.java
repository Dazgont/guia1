public class ejercicio8{
    public static void main(String[] args){
    float[] array1 = { 1, 5, 3, 6, 1, 3 };
    double[] arrayDev = multiplicarPorPI(array1);
    System.out.println("Resultado: ");
    for (int i = 0; i < arrayDev.length; i++){
    System.out.println(arrayDev[i]);
    }
    }
    public static double[] multiplicarPorPI(float[] array){
    if (array.length == 0){
    throw new RuntimeException("No elements in array");
    }
    double[] arrayDev = new double[ array.length ];
    for (int i = 0; i < array.length; i++){
    arrayDev[i] = array[i] * 3.14;
    }
    return arrayDev;
    }
    }