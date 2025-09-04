public class StringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "Alguna_Imagen.jpeg";
        int i = archivo.lastIndexOf('.');
        System.out.println("archivo = " + archivo.substring(i+1));
    }
}
