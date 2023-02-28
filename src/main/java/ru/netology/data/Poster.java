package ru.netology.data;

public class Poster {

    private int id;
    private String namePoster;

    public Poster (){
    }

    public Poster(int id, String namePoster) {
        this.id = id;
        this.namePoster = namePoster;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNamePoster(String namePoster) {
        this.namePoster = namePoster;
    }

    public int getId() {
        return id;
    }

    public String getNamePoster() {
        return namePoster;
    }
}