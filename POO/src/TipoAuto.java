public enum TipoAuto {
    SEDAN("Sedan","Auto mediano",4),
    STATION_WAGON("Station Wagon","Auto Grande",4),
    HATCHBACK("Hatchback","Auto compacto",4),
    PICKUP("Pickup","Camioneta",4),
    COUPE("Coupé","Auto pequeño",2),
    CONVERTIBLE("Convertible","Auto deportivo",2),
    FURGON("Furgon","Auto utilitario",4),
    NULO("Sin Auto","no tiene descripcion",0);

    private final String nombre;
    private final int numeroPuertas;
    private  final  String descripcion;

    TipoAuto(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
