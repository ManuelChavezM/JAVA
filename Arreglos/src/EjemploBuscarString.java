import java.util.Scanner;

public class EjemploBuscarString {
    public static void main(String[] args) {
        String[] names = new String[4];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 4 nombres");
        for (int i = 0; i < names.length; i++) {
            System.out.println("ingrese un nombre: ");
            names[i] = s.next();
        }

        System.out.println("\r\n Ingrese el nombre que quiere buscar");
        String searchName = s.next();

        //buscamos
        int i = 0;
        for (; i < names.length && !names[i].equalsIgnoreCase(searchName); i++) {

        }

        if (i == names.length){
            System.out.println("Nombre no encontrado No existe");
        } else if (names[i].toLowerCase().compareTo(searchName.toLowerCase())==0) {
            System.out.println("Nombre encontrado en la posicion: " + i);
        }

    }
}
