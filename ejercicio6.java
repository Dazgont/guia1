
public class ejercicio6{
public static void main(String[] args){
int[] array1 = { 8, 6, 2, 11, 5 };
int[] array2 = { 1, 2, 3, 4, 5 };
int[] arrayDev = productoDeArreglos(array1, array2);
System.out.println("Resultado: ");
for (int i = 0; i < arrayDev.length; i++){
System.out.println(arrayDev[i]);
}
}
public static int[] productoDeArreglos(int[] array1, int[] array2){
if (array1.length == 0 || array2.length == 0){
throw new RuntimeException("No elements in one of the arrays");
}
if (array1.length != array2.length){
throw new RuntimeException("Different lengths in the arrays");
}
int[] arrayDev = new int[ array1.length ];
System.out.println("Resultado: ");
int n = arrayDev.length;
for (int i = 0; i < arrayDev.length; i++){
arrayDev[i] = array1[i] * array2[n - i + 1];
}
return arrayDev;
}
}