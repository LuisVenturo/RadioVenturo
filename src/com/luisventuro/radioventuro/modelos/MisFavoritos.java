package com.luisventuro.radioventuro.modelos;

public class MisFavoritos {
    public void adiciona(Audio audio){
        if (audio.getClasficacion() >= 8){
            System.out.println(audio.getTitulo() + "Es uno de los favoritos del momento");
        }else {
            System.out.println(audio.getTitulo() + "Tambien es uno de los favoritos");
        }
    }
}
