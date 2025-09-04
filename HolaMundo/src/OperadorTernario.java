import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        // tipo variable = condicion ? si es verdadero : si es falso;

        int max = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un primer numero");
        int num1 = s.nextInt();

        System.out.println("Ingrese un segundo numero");
        int num2 = s.nextInt();

        System.out.println("Ingrese un tercero numero");
        int num3 = s.nextInt();

        System.out.println("Ingrese un cuarto numero");
        int num4 = s.nextInt();

        max = num1 > num2 ? num1:num2;
        max = max > num3 ? max : num3;
        max = max > num4 ? max : num4;

        System.out.println("el numero maxiomo es  = " + max);

    }
}
