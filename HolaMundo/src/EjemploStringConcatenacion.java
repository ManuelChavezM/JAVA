public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String instructor = "La Vida Moles";

        String detalleCurso = curso + " con la instructora " + instructor;
        System.out.println(detalleCurso);

        int numA = 10;
        int numB = 5;

        System.out.println(detalleCurso + " " + numA + numB); //cuidado con la precedencia de los operadores ya que en este caso asume que todo es una cadena

        System.out.println(detalleCurso + " " + (numA + numB));// asi funciona bien por la precedencia de operadore

        // el metodo concat concatena regresando una nueva instancia modificada mientras que el + crea una instancia del string builder
        String detalleCurso2 = curso.concat(" con la mejor llamada ").concat(instructor);
        System.out.println("detalleCurso2 = " + detalleCurso2);

        detalleCurso2 = curso.concat(" con la mejor llamada ".concat(instructor));
        System.out.println("detalleCurso2 = " + detalleCurso2);





    }
}
