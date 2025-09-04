import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int[] arrNums, pares, impares;
        arrNums = new int[10];

        Scanner s = new Scanner(System.in);

        // se rellena el arreglo
        System.out.println("Ingrese 10 numeros");
        for (int i = 0; i < arrNums.length; i++) {
            arrNums[i]= s.nextInt();
        }

        // calcular numero de pares e impares
        int totalPares = 0, totalImpares = 0;
        for (int i = 0; i <  arrNums.length; i++) {
            if (arrNums[i]%2 == 0){
                totalPares++;
            }else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        //rellenar arreglo de pares e impares
        int jPar = 0, kImpar = 0;

        for (int i = 0; i <  arrNums.length; i++) {
            if (arrNums[i]%2 == 0){
                pares[jPar++]= arrNums[i];
            }else {
                impares[kImpar++]=arrNums[i];
            }
        }

        System.out.println("Arreglo de numeros pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i]+" ");
        }

        System.out.println("\r\nArreglo de numeros impares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i]+" ");
        }

    }
}
