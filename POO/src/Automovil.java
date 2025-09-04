public class Automovil {
    private String fabricante;
    private String modelo;
    private Color color;
    private double cilindrada;
    private int capacidadTanque=40;

    //CONSTANTES
    public  static  final  Integer VELOCIDAD_MAXIMA_CARRETERA = 120;

    private  TipoAuto tipo= TipoAuto.NULO;

    //Constructor
    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    //Sobrecarga del constructor
    public Automovil(){

    }

    //Getters and setters
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }


    public double getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }


    public int getCapacidadTanque() {
        return capacidadTanque;
    }
    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }


    public TipoAuto getTipo() {
        return tipo;
    }

    public void setTipo(TipoAuto tipo) {
        this.tipo = tipo;
    }

    //Metodos
    public  String detalle(){

        StringBuilder sb = new StringBuilder();
        sb.append("color = " + this.color +" , ");
        sb.append("fabricante = " + this.fabricante+" , ");
        sb.append("modelo = " + this.modelo+" , ");
        sb.append("tipo Auto = "+ this.getTipo().getNombre()+" , ");
        sb.append("Descripcion = "+ this.getTipo().getDescripcion()+" , ");
        sb.append("numero Puertas = "+ this.getTipo().getNumeroPuertas()+" , ");
        sb.append("cilindrada = " + this.cilindrada+" ");
        return sb.toString();
    }

    public String aclerar(int rpm){
        return "El auto "+ this.modelo+ " "+this.fabricante+ " esta acelerando a "+rpm+ " rpm";
    }

    public String frenar(){

        return "El auto "+ this.modelo+ " "+this.fabricante+ " esta frenando! ";
    }

    public String acelerarFrenar(int rpm){
        String aceleron = this.aclerar(rpm);
        String freno = this.frenar();
        return aceleron+"\n"+freno;
    }

    public float calcularConsumo(int km,float porcentajeGas){

        return km/(this.capacidadTanque*porcentajeGas);
    }


    //sobrecarga de metodos es cuando tiene el mismo nobre pero diferentes tipos de argumentos

    public float calcularConsumo(int km,int porcentajeGas){

        return km/(this.capacidadTanque*(porcentajeGas/100f));
    }
}
