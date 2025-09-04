import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Manuel";

        System.out.println("nombre.length() (largo de la cadena) = " + nombre.length());
        System.out.println("nombre.toUpperCase() (convertir a mayusculas) = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() (convertir a minusculas) = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Manuel\") (comparar cadenas a nivel de valor) = " + nombre.equals("Manuel"));
        System.out.println("nombre.equals(\"manuel\") (comparar cadenas a nivel de valor) = " + nombre.equals("manuel"));
        System.out.println("nombre.equals(\"manuel\") (comparar cadenas a nivel de valor) = " + nombre.equalsIgnoreCase("manuel"));
        System.out.println("nombre.compareTo(\"Manuel\") = " + nombre.compareTo("Manuel")); // si es 0 son iguales
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // extrae una caracter por medio de un indice y lo regresa en char
        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));

        String Trabalenguas = "Trabalenguas";
        System.out.println("Trabalenguas.replace(\"a\",\"A\") = " + Trabalenguas.replace("a","A"));
        System.out.println("Trabalenguas.indexOf('u') = " + Trabalenguas.indexOf('u'));
        System.out.println("Trabalenguas.lastIndexOf('a') = " + Trabalenguas.lastIndexOf('a'));
        System.out.println("Trabalenguas.indexOf('z') = " + Trabalenguas.indexOf('z'));
        System.out.println("Trabalenguas.contains(\"T\") = " + Trabalenguas.contains("T"));
        System.out.println("Trabalenguas.startsWith(\"lenguas\") = " + Trabalenguas.startsWith("lenguas"));
        System.out.println("Trabalenguas.startsWith(\"Traba\") = " + Trabalenguas.startsWith("Traba"));
        System.out.println("Trabalenguas.endsWith(\"as\") = " + Trabalenguas.endsWith("as"));
        System.out.println("            Trabalenguas   ");
        System.out.println("            Trabalenguas   ".trim());
    }
}
