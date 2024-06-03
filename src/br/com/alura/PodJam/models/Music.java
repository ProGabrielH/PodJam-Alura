package br.com.alura.PodJam.models;

import br.com.alura.PodJam.interfaces.Listenable;

public class Music extends Midia implements Listenable{

    private Album album;

    public Music(String title, String author, int duration, Album album){
        this.setTitle(title);
        this.setAuthor(author);
        this.setDuration(duration);
        if (album != null){
            this.album = album;
            album.addMusic(this);
        }
    }

    @Override
    public void listen(){
        System.out.println("Você está escutando " + getTitle() + " por " + getAuthor());
        addListens();
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        if (album != null){
            this.album = album;
            album.addMusic(this);
        }
    }

}
