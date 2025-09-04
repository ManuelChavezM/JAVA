class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public  String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona ps = new Persona();
        ps.modificarNombre("Mani");

        System.out.println("Iniciamos metodo main");
        System.out.println("persona = " + ps.leerNombre());

        System.out.println("Antes del metodo test");

        testeo(ps);
        System.out.println("Despues de llamar al metodo test");
        System.out.println("persona despues del metodo test = " + ps.leerNombre());
        System.out.println("Fin del main");


    }

    public static void  testeo(Persona psNuevo){
        System.out.println("Entramos al metodo test");
        psNuevo.modificarNombre("Hayabusha");
        System.out.println("Finaliza el metodo test");
    }
}
