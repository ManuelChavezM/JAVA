package poo.snow.poointerfaces;

import poo.snow.poointerfaces.modelo.Cliente;
import poo.snow.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        OrdenablePaginableCrudContableRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano","Perez"));
        repo.crear(new Cliente("Bea","Gonzales"));
        repo.crear(new Cliente("Luci","Martinez"));
        repo.crear(new Cliente("Mani","snow"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("=====Pagi======");

        //el indice hasta es excluyente
        List<Cliente> repositorio = repo.listar(1,3);
        repositorio.forEach(System.out::println);

        System.out.println("=====Ordenamiento ASC======");
        List<Cliente> clientesOrdenASC = repo.listar("nombre", Direccion.ASC);
        for (Cliente c : clientesOrdenASC){
            System.out.println(c);
        }

        System.out.println("=====Ordenamiento DESC======");
        List<Cliente> clientesOrdenDESC = repo.listar("nombre", Direccion.DESC);
        for (Cliente c : clientesOrdenDESC){
            System.out.println(c);
        }

        System.out.println("=====Ordenamiento ASC apellido======");
        List<Cliente> clientesOrdenASCap = repo.listar("apellido", Direccion.ASC);
        for (Cliente c : clientesOrdenASCap){
            System.out.println(c);
        }

        System.out.println("=====Ordenamiento DESC apellido======");
        List<Cliente> clientesOrdenDESCap = repo.listar("apellido", Direccion.DESC);
        for (Cliente c : clientesOrdenDESCap){
            System.out.println(c);
        }

        System.out.println();
        System.out.println("===== Editar ======");
        Cliente clintActualizar = new Cliente("Bea","Mena");
        clintActualizar.setId(2);
        repo.editar(clintActualizar);
        Cliente a = repo.porId(2);
        System.out.println(a);
        System.out.println();
        List<Cliente> clientes2 = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println();
        System.out.println("===== Eliminar ======");
        repo.eliminar(2);
        List<Cliente> clientes3 = repo.listar();
        clientes.forEach(System.out::println);


        System.out.println();
        System.out.println("===== Count ======");
        System.out.println("Total de registros: "+ repo.total());

    }
}
