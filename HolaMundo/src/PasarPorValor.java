public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("inicial el metodo main con i = " + i);
        test(i);
        System.out.println("finaliza el metodo main con i = " + i);

    }

    public  static  void test(int x){
        System.out.println("inicia el metodo test con x = " + x);
        x = 30;
        System.out.println("finaloza el metodo test con x = " + x);
    }
}
