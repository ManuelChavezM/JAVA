public enum Color {
    // es una coleccion de atributos constantes
    //siempre se escriben los atributos con mayusculas
    ROJO("rojo"),
    AMARILLO("amarillo"),
    AZUL("azul"),
    BLANCO("blanco"),
    GRIS("gris oscuro"),
    NARANJA("naranja");

    private  final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
