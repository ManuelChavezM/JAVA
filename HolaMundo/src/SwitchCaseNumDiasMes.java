import java.util.Scanner;

public class SwitchCaseNumDiasMes {
    public static void main(String[] args) {

        int numDias = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes del 1-12");
        int mes = s.nextInt();

        System.out.println("Ingrese el año (YYYY)");
        int anio = s.nextInt();

        switch (mes){
            case 1:
                System.out.println("El mes es ENERO");
                break;
            case 2:
                System.out.println("El mes es FEBRERO");
                break;
            case 3:
                System.out.println("El mes es MARZO");
                break;
            case 4:
                System.out.println("El mes es ABRIL");
                break;
            case 5:
                System.out.println("El mes es MAYO");
                break;
            case 6:
                System.out.println("El mes es JUNIO");
                break;
            case 7:
                System.out.println("El mes es JULIO");
                break;
            case 8:
                System.out.println("El mes es AGOSTO");
                break;
            case 9:
                System.out.println("El mes es SEPTIEMBRE");
                break;
            case 10:
                System.out.println("El mes es OCTUBRE");
                break;
            case 11:
                System.out.println("El mes es NOVIEMBRE");
                break;
            case 12:
                System.out.println("El mes es DICIEMBRE");
                break;
            default:
                System.out.println("ESE MES NO EXISTE!!!");
                break;
        }


        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
                    numDias = 29;
                }else {
                    numDias = 28;
                }
                break;

            default:
                System.out.println("numero de dias indefinido");
                break;
        }

        System.out.println("Dias que tiene el mes es "+ numDias);

    }
}
