package br.com.alura.PodJam.models;

public class Midia {
    
    private String title;
    private String author;
    private int duration;
    private int listeners;

    protected void addListens(){
        listeners += 1;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getListeners(){
        return listeners;
    }
    
}
