package poo.snow.poointerfaces.repositorio;

import poo.snow.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
