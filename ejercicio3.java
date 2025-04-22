
public class ejercicio3 {
    public static Boolean TodosPositivos(int[]array){
        boolean positivos = true;
        for(int i = 0; i < array.length;i++){
            if(array[i] <= 0){
                positivos = false;
            }
        }
        return positivos;

    }
    public static void main (String args[]){
        int[] array = {1, 6, -3, 4, 5, 10};
        System.out.println(TodosPositivos(array));

    }
}
