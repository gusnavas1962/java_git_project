package com.app;

public class ContenidoAudiovisual {
    public String titulo;
    protected int duracionEnMinutos;
    public String genero;
    
    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
    }
}