package ru.netology.repository;

import ru.netology.data.Poster;

public class PosterRepository {
    private Poster[] posters = new Poster[0];


    public PosterRepository() {
        size = 10;
    }

    public PosterRepository(int arrayLength) {
        size = arrayLength;
    }

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    protected Poster[] getPosters() {
        return posters;
    }

    public Poster[] findAll() {
        return getPosters();
    }


    public void save(Poster poster) {
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }


    public Poster[] findLast() {

        if (size <= 0) {
            size = 1;
        }

        Poster[] all = getPosters();
        Poster[] tmp = new Poster[size];

        for (int i = 0; i < size && all.length > i; i++) {

            tmp[i] = all[all.length - 1 - i];
        }
        return tmp;
    }

}

