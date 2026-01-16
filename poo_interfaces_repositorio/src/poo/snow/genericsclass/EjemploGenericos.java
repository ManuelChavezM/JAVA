package poo.snow.genericsclass;

public class EjemploGenericos {
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("GoldShip","Caballo"));
        transporteCaballos.add(new Animal("airGrove","Caballo"));
        transporteCaballos.add(new Animal("Silent","Caballo"));
        transporteCaballos.add(new Animal("zuzu","Caballo"));
        transporteCaballos.add(new Animal("Tormenta","Caballo"));

        ImprimirCamion(transporteCaballos);


        System.out.println();

        Camion<Maquinaria> transporteMaquinaria = new Camion<>(3);
        transporteMaquinaria.add(new Maquinaria("buldoser"));
        transporteMaquinaria.add(new Maquinaria("Excavadora"));
        transporteMaquinaria.add(new Maquinaria("R-300"));

        ImprimirCamion(transporteMaquinaria);


        System.out.println();

        Camion<Automovil> transporteAutos = new Camion<>(3);
        transporteAutos.add(new Automovil("suzuki"));
        transporteAutos.add(new Automovil("Mazda"));
        transporteAutos.add(new Automovil("Ford"));

        ImprimirCamion(transporteAutos);


    }
    public static<T> void ImprimirCamion(Camion<T> camion){
        for (T a: camion){
            if(a instanceof Animal){
                System.out.println(((Animal)a).getNombre()+" "+((Animal)a).getTipo());
            }
            else if(a instanceof Maquinaria){
                System.out.println(((Maquinaria)a).getTipo());
            }
            else if(a instanceof Automovil){
                System.out.println(((Automovil)a).getMarca());
            }
        }
    }
}
