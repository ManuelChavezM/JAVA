import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {
        String userName = System.getProperty("user.name");
        System.out.println("userName = " + userName);

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
