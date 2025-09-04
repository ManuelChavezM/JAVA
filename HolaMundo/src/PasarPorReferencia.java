public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edades = {11,12,13};
        System.out.println("Inicia el main");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades = " + edades[i]);
        }
        System.out.println("Antes del metodo test");
        test(edades);
        System.out.println("Despues del test en el metodo main queda ");

        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades = " + edades[i]);
        }
    }

    public  static void  test(int[] ageArr){
        System.out.println("Inicia el metodo test");
        for (int i = 0; i < ageArr.length; i++) {
            System.out.println("ageArr = " + ageArr[i]);
        }
        System.out.println("se modifican los valores");
        for (int i = 0; i < ageArr.length; i++) {
            ageArr[i] *=2;
            System.out.println("ageArr = " + ageArr[i]);
        }

        System.out.println("Fin del metodo test");
    }
}
