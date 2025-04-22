public class ejercicio4{
    public static int ProductoBooleano(boolean [] array){
        int parpositivos = 0;
        int imparnegativos = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == true && i % 2 == 0){
                parpositivos++;
            }
            if(array[i] == false && i % 2 != 0){
                imparnegativos++;
            }
        }
        return parpositivos * imparnegativos;
    }
    public static void main(String[] args) {
        boolean [] array = {true, false, true, false, true, false, true, false};
        System.out.println(ProductoBooleano(array));
    }
}