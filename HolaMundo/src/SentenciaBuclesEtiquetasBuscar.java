public class SentenciaBuclesEtiquetasBuscar {
    public static void main(String[] args) {
        String frase= ("trigo Tres tristez tigres tragaban trigotrigo en un trigaltrigo").toLowerCase();
        String palabra= ("TRIGO").toLowerCase();

        int maxFrase = frase.length();
        int maxPalabra = palabra.length();
        int cantidad = 0;


        Bucle1: for (int i = 0; i < maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)){
                    continue Bucle1;
                }
            }

            cantidad++;
        }

        System.out.println("cantidad  de veces en las que aparece "+palabra +" en la frase= " + cantidad);

    }
}
