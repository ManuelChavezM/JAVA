public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String instructor = "La Vida Moles";

        String resultado = curso.concat(instructor);
        // lo que pasa es que los strings son inmutables por eso no se modifica curso sino que al cacharla en una nueva instancia resultado es donde se ve correctamente
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = resultado.replace("a","A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado2 = " + resultado2);// hay que cachar en una nueva instancia porque la cadena propia es inmutable



    }
}
