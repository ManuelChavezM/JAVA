import java.util.Scanner;

public class EjemploDesplazamientoNumeros {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        System.out.println("ingrese 10 numeros");
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese un numero: ");
            numeros[i]=s.nextInt();
        }

        //desplazamiento
        int aux = 0;
        int aux2 = 0;
        for (int i = numeros.length-1; i >= 0; i--) {
            aux2 = i;
            if (aux2 != numeros.length-1){
                numeros[aux2+1]=numeros[i];
            }else {
                aux = numeros[i];
            }
        }
        numeros[0] = aux;

        System.out.println("\r\nImprime el arreglo desplazado");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
    }

}
