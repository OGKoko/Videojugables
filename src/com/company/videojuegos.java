package com.company;

import java.time.LocalDate;

/**
 * Created by 25374183p on 13/12/2016.
 */
public class videojuegos {

    private long id;
    private String nombre;
    private String empresa;
    private LocalDate fechaLanz;
    private int numeroVentas;
    private String genero;
    private String pegi;
    private long numeroJugad;
    private String plataforma;
    private int precio;

//-------------------- constructor--------------------------------------------------

    public videojuegos(long id, String nombre, String empresa, LocalDate fechaLanz, int numeroVentas, String genero, String pegi, long numeroJugad, String plataforma, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.empresa = empresa;
        this.fechaLanz = fechaLanz;
        this.numeroVentas = numeroVentas;
        this.genero = genero;
        this.pegi = pegi;
        this.numeroJugad = numeroJugad;
        this.plataforma = plataforma;
        this.precio = precio;
    }


    //--------------- getters --------------------------

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public LocalDate getFechaLanz() {
        return fechaLanz;
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public String getGenero() {
        return genero;
    }

    public String getPegi() {
        return pegi;
    }

    public long getNumeroJugad() {
        return numeroJugad;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getPrecio() {
        return precio;
    }

    //--------------------- setters-------------------------------

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setFechaLanz(LocalDate fechaLanz) {
        this.fechaLanz = fechaLanz;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPegi(String pegi) {
        this.pegi = pegi;
    }

    public void setNumeroJugad(long numeroJugad) {
        this.numeroJugad = numeroJugad;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }




}
