import java.util.Scanner;

public class EliminarElementoArreglo {
    public static void main(String[] args) {
        int[] a = new int[7];
        int nDelete = 0, pos = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("ingrese 7 numeros");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("que numero quiere eliminar");
        nDelete = s.nextInt();


        int j =0;
        while (a[j]!=nDelete){
            j++;
            pos = j;
        }

        if (nDelete == a[a.length-1] ){
            a[a.length-1] = 0;
        }

        for (int i = pos;i<a.length-1 && a[a.length-1] !=0 ;i++ ){
            a[i]=a[i+1];
        }



        System.out.println("imprime el arreglo");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

