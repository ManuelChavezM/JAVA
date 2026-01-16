package poo.snow.poointerfaces.repositorio;

import poo.snow.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements OrdenablePaginableCrudContableRepositorio{

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    //Regresar la lista de Clientes
    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    //encontrar cliente por identificador
    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for (Cliente c: dataSource){
            if (c.getId()!= null && c.getId().equals(id)){
                resultado = c;
                break;
            }
        }
        return resultado;
    }

    //añadir cliente
    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    //Modificar Cliente
    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    //Metodo para eliminar
    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }


    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b) {
                int resultado = 0;
                if(dir == Direccion.ASC){
                    switch (campo){
                        case "id" ->
                            resultado = a.getId().compareTo(b.getId());
                        case "nombre" ->
                            resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido" ->
                            resultado = a.getApellido().compareTo(b.getApellido());
                    }
                } else if(dir == Direccion.DESC){
                    switch (campo){
                        case "id" ->
                                resultado = b.getId().compareTo(a.getId());
                        case "nombre" ->
                                resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido" ->
                                resultado = b.getApellido().compareTo(a.getApellido());
                    }
                }
                return resultado;
            }
        });
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
