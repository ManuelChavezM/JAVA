public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil a = new Automovil("Ferrari","El venonoso");
        Automovil b = new Automovil();

        System.out.println(a.detalle());
        System.out.println(b.detalle());

        a.setColor(Color.ROJO);
        a.setFabricante("Lamborgini");
        a.setModelo("inspired");
        a.setCilindrada(5.5);
        System.out.println();

        System.out.println(a.detalle());
        System.out.println();
        System.out.println(a.aclerar(3500));
        System.out.println(a.frenar());
        System.out.println(a.acelerarFrenar(9000));

        System.out.println("kilometros por litro: "+a.calcularConsumo(300,0.6f));
        //sobrecarga de metodos
        System.out.println("kilometros por litro: "+a.calcularConsumo(300,60));
    }
}
