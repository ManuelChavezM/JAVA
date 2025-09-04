public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = {"Dom","Hanna","Mani","Pochita","Ahri"};
        int count = nombres.length;
        for (int i = 0; i<count; i++){
            if (nombres[i].equalsIgnoreCase("mani") || nombres[i].equalsIgnoreCase("ahri")){
                continue; // se salta la iteracion
            }
            System.out.println(i + " .- " + nombres[i] );
        }
    }
}
