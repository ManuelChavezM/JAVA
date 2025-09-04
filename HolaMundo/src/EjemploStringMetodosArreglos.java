public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
        String Trabalenguas = "Trabalenguas";

        char[] arreglo = Trabalenguas.toCharArray();
        int extension = arreglo.length;

        System.out.println("extension = " + extension);

        for (int i = 0; i<extension; i ++){
            System.out.println("arreglo = " + arreglo[i]);
        }

        System.out.println("\n");

        String[] arreglo2 = Trabalenguas.split("a");
        int l = arreglo2.length;

        for (int x = 0; x<l ; x++){
            System.out.println("arreglo2 = " + arreglo2[x]);
        }


        System.out.println("\n");

        String archivo = "Alguna.Imagen.pdf";
        String[] fileArg = archivo.split("\\.");//[.] se tiene que escapar el punto porque es un caracter especial entonces hay que indicarlo con la doble barra en otro caso no funciona
        int largo = fileArg.length;
        for (int z = 0; z<largo; z++){
            System.out.println("fileArg = " + fileArg[z]);
        }
        System.out.println();
        System.out.println("Extension es = " + fileArg[largo-1]);

    }
}
