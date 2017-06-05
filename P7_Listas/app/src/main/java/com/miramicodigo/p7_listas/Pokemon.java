package com.miramicodigo.p7_listas;

import java.io.Serializable;

/**
 *
 * @author Gustavo Lizarraga
 * @date 05/06/2017
 *
 * */

public class Pokemon {
    private String Nombre;
    private String Tipo;
    private int Imagen;

    public Pokemon() {
    }

    public Pokemon(String nombre) {
        Nombre = nombre;
    }

    public Pokemon(String nombre, String habilidades) {
        Nombre = nombre;
        Tipo = habilidades;
    }

    public Pokemon(String nombre, String habilidades, int imagen) {
        Nombre = nombre;
        Tipo = habilidades;
        Imagen = imagen;
    }

}
