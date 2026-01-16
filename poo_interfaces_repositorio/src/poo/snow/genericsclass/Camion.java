package poo.snow.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Camion<T> implements Iterable<T> {
    private List<T> objetos;
    private  int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void add(T objeto){
        if (this.objetos.size()<= max){
            this.objetos.add(objeto);
        }else {
            throw  new RuntimeException("no hay mas espacio");
        }

    }

    //Recorrer la lista
    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
