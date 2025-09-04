public class AutoBoxingInteger {
    public static void main(String[] args) {
        Integer[] enteros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int suma = 0;

        for (Integer i : enteros){
            if(i.intValue() % 2 == 0){
                suma += i.intValue();
            }
        }

        System.out.println("suma = " + suma);

        //AutoBoxing

        suma =0;

        for (Integer i : enteros){
            if(i % 2 == 0){
                suma += i;
            }
        }

        System.out.println("suma = " + suma);


        //====================================D


        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println(num1 == num2);

        num2 = 1000;
        System.out.println("Son la misma instancia del objeto = "+(num1 == num2)); // contiene el mismo valor pero no la misma instancia
        // cuando se usa "==" en primitivos compara valor y cuando se usa en objetos compara por la instancia

        //para comparar por valor
        System.out.println("tiene el mismo valor = "+(num1.equals(num2)));

        // se obtinene su valor primitivo para hacer la comparacion con "==" y de esta manera sea por valor y no por referencia
        System.out.println("Son la misma por valor con tipo de referencias = "+(num1.intValue() == num2.intValue()));
        //Nota: sin embargo en los booleans esto no aplica si se tiene dons objetos Booleans y se comparan con "=="
        //la comparacion la hace por valor como si fueran primitivos "boolean" y no "Boolean"
        // lo hace de forma automatica el unboxing

    // esto es lo mismo que.....
        num2 = 500;
        boolean condicion  = num1 > num2;
        System.out.println("condicion = " + condicion);

        //esto..... ya que java hace el autounboxincing de manera automatica con los demas operadores menos con  el "==" pasa lo de arriba con ese operador en especifico
        condicion  = num1.intValue() > num2.intValue();
        System.out.println("condicion = " + condicion);


    }
}
