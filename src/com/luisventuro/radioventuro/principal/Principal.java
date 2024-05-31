package com.luisventuro.radioventuro.principal;

import com.luisventuro.radioventuro.modelos.Cancion;
import com.luisventuro.radioventuro.modelos.MisFavoritos;
import com.luisventuro.radioventuro.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Cafe. Tech");

        //canciones

        for(int i = 0; i<100; i++){
            miCancion.meGusta();
        }
        for (int i = 0; i<2000; i++){
            miCancion.reproduce();
        }
        //Podcast
        for(int i = 0; i<100; i++){
            miPodcast.meGusta();
        }
        for (int i = 0; i<8000; i++){
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones: "+miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(miPodcast);
        favoritos.adiciona(miCancion);
    }
}
