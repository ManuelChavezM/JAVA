import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String userName="Mani";
        String pass="123";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario");

        String user = scanner.next();

        System.out.println("Ingrese el Password");

        String p = scanner.next();

        Boolean esAutenticado = false;

        if (userName.equals(user) && pass.equals(p)){
            esAutenticado = true;
            System.out.println("Happy Hacking");
        }else {
            System.out.println("User o Password son incorrectos");
        }

        if (esAutenticado){
            System.out.println("Bienvenido ".concat(user).concat(" !"));
        }else {
            System.out.println("Gracias por participar");
        }
    }
}
