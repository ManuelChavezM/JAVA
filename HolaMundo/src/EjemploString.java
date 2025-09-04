public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");
        String curso3 = new String("programacion java");
        String curso4 = "Programacion Java";


        Boolean esIgual = curso == curso2; // comparacion por referencia
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equals(curso2); //comparacion por valor es decir contenido de la variable
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso3); //comparacion por valor es decir contenido de la variable sin tomar en cuenta mayusculas y minusculas
        System.out.println("esIgual = " + esIgual);

        esIgual = curso == curso4; // comparacion cunado el valor es directo con comillas la referencia apunta al mismo valor por eso es true
        System.out.println("curso == curso4 = " + esIgual);

    }
}
