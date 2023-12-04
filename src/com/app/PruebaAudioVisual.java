package com.app;

public class PruebaAudioVisual {
	public static void main(String[] args) {
	    	System.out.println("Hello from AWS Cloud9!");
    		ContenidoAudiovisual av = new ContenidoAudiovisual("Avatar", 125, "Accion");
    		ContenidoAudiovisual deeter = new ContenidoAudiovisual("De aqui a la Eternindad", 90, "accion");
    		av.titulo = "De aqui a la Eternidad";
    		av.duracionEnMinutos = 140;
    		av.genero = "Guerra";
	}
	
}