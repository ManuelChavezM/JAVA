package com.snow.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {
    private List<Imprimible> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas= new ArrayList<>();
    }

    public Libro addPagina(Imprimible pag){
        paginas.add(pag);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");

        sb.append(this.titulo)
                .append("\n").append("Autor: ").append(this.autor.toString())
                .append("\n").append("Genero: ").append(genero)
                .append("\n").append("Contenido: ").append("\n");
        for (Imprimible pg:this.paginas){
            sb.append(pg.imprimir())
            .append("\n");
        }
        return sb.toString();
    }
}
