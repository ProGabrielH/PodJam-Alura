package br.com.alura.PodJam.models;

import br.com.alura.PodJam.interfaces.Listenable;

public class Podcast extends Midia implements Listenable {

    public Podcast(String title, String author, int duration){
        this.setTitle(title);
        this.setAuthor(author);
        this.setDuration(duration);
    }

    @Override
    public void listen(){
        System.out.println("Você está escutando " + getTitle() + " por " + getAuthor());
        addListens();
    }

}
