public class EjemploAutomovil2 {
    public static void main(String[] args) {
        Automovil a = new Automovil("Ferrari","El venonoso");
        Automovil b = new Automovil();

        System.out.println(a.detalle());
        System.out.println(b.detalle());

        a.setColor(Color.NARANJA);
        a.setTipo(TipoAuto.CONVERTIBLE);
        b.setTipo(TipoAuto.COUPE);


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

        System.out.println(b.getTipo().getNombre());
        System.out.println(b.getTipo().getDescripcion());
        System.out.println(b.getTipo().getNumeroPuertas());


        TipoAuto tipo = a.getTipo();
        switch (tipo){
            case NULO:
                System.out.println("no tiene asignado nada de nada");
                break;
            case COUPE:
                System.out.println("eso definitivamente es un sedan");
                break;
            case FURGON:
                System.out.println("esto se parece a un furgon");
                break;
            case PICKUP:
                System.out.println("esto es una pickup para el mandado");
                break;
            case HATCHBACK:
                System.out.println("esto se llama un hatchback");
                break;
            case CONVERTIBLE:
                System.out.println("esto es un run run profesional deportivo ya tu sabe");
                break;
            case STATION_WAGON:
                System.out.println("esto creo una wagon");
                break;
            default:
                break;
        }
    }
}
