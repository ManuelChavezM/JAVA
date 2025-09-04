import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el promedio");
        Float promedio = s.nextFloat();
        
        if (promedio >= 8.0){
            System.out.println("Felicidades");
        } else if (promedio >= 6.0) {
            System.out.println("Bueno");
        } else if (promedio >= 5.0) {
            System.out.println("Meee...");
        }else {
            System.out.println("LLegale");
        }
    }
}
