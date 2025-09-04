public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null; // sin instancia ni referencia
        
        Boolean esNulo = curso == null;

        if(esNulo == true){
            System.out.println("esNulo = " + esNulo);
            curso = "";
        }

        if (curso.length() == 0){

            System.out.println("esVacio = true");
        }

        if (curso.isEmpty()){
            System.out.println("esEmpty(osea vacio) = true");
            curso = " ";//se agrega un espacio
        }

        if (!curso.isEmpty()){
            System.out.println("noEsEmpty(osea no esta vacio) = true");
        }

        if (curso.isBlank()){ // valida que sea espacios en blanco

            System.out.println("tiene un espacio vacio");
        }


    }
}
