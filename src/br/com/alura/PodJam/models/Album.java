package br.com.alura.PodJam.models;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String name;
    private List<Music> musics;

    public Album(String name){
        this.name = name;
        this.musics = new ArrayList<>();
    }

    public void addMusic(Music music) {
        if (music != null){
            musics.add(music);
        }
    }

    public int getListeners(){
        int totalListeners = 0;
        for (Music music : musics){
            totalListeners += music.getListeners();
        }
        return totalListeners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}
