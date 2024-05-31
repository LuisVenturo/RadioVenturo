package com.luisventuro.radioventuro.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int totalDeMeGusta;
    private int clasficacion;

    //Métodos

    public void meGusta(){
        this.totalDeMeGusta++;
    }

    public void reproduce(){
        this.totalDeReproducciones++;
    }

    //Getter y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getClasficacion() {
        return clasficacion;
    }

    public void setClasficacion(int clasficacion) {
        this.clasficacion = clasficacion;
    }
}
