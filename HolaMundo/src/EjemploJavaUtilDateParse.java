import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Ingrese una fecha con formarto \"dd-MM-yyyy\"");

        try {
            Date fecha = f.parse(s.next());//Parse convierte un string en objeto date
            System.out.println("fecha = " + fecha);
            System.out.println("f = " + f.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if(fecha.after(fecha2)){
                System.out.println("La fecha del usuario es mayor o despues que la actual");
            }else if (fecha.before(fecha2)) {
                System.out.println(" la fecha del usuario es antes o menor que la actual");
            } else if (fecha.equals(fecha2)) {
                System.out.println("las fechas son iguales");
            }


            if(fecha.compareTo(fecha2)>0){
                System.out.println("La fecha del usuario es mayor o despues que la actual");
            }else if (fecha.compareTo(fecha2)<0) {
                System.out.println(" la fecha del usuario es antes o menor que la actual");
            } else if (fecha.compareTo(fecha2)==0) {
                System.out.println("las fechas son iguales");
            }


        } catch (ParseException e) {
            System.out.println("error de formato o fecha");
            throw new RuntimeException(e);
        }

    }
}
