
public class ejercicio1y2 {
        public static void main (String[]args){
            int Array[]= {12,8,18,0,-1,2};
            System.out.println(PosicionMenor(Array));
            System.out.println(PosicionMayor(Array));
        }
    
    public static int PosicionMenor(int[] Array){
        int menor = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < menor){
                menor = Array[i];
            } }
            return menor;
    
        }
    public static int PosicionMayor(int[] Array){
        int mayor = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > mayor) {
                mayor = Array[i];
            }
    }
    return mayor;
    }
}