import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat sf = new SimpleDateFormat("dd MMMM yyyy");
        String fechaStr = sf.format(fecha);
        System.out.println("fechaStr = " + fechaStr);


    }

}
