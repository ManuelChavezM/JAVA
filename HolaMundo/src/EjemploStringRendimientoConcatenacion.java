public class EjemploStringRendimientoConcatenacion {
    public static void main(String[] args) {

        String a = "A";
        String b = "B";
        String c = "C";

        StringBuilder sb = new StringBuilder(a);

        long inicio =  System.currentTimeMillis();

        for (int i=0;i<10000;i++){
            //c = c.concat(a).concat(b).concat("\n"); // es el menos optimo para cadenas muy grandes pero para pequeñas esta bien
           // c += a+b+"\n"; // es mejor que concat para cadenas grandes pero no para chicas
            sb.append(a).append(b).append("\n"); //metodos encadenados porque retorna su misma instancia es el mas optimizado

        }

        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);
    }
}
