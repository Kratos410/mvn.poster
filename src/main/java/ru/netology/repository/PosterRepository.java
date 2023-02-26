package ru.netology.repository;

import ru.netology.data.Poster;

public class PosterRepository {
    private Poster[] posters = new Poster[0];

    int arrayLength;
    int size;

    public PosterRepository() {
        size = 10;
    }

    public PosterRepository(int arrayLength) {
        size = arrayLength;
    }

    public Poster[] getPosters() {
        return posters;
    }

    public void setPosters(Poster poster) {
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public Poster[] findAll() {
        return getPosters();
    }

    public Poster[] findLast() {
        if (size >= 0) {
            arrayLength = size;
        } else {
            arrayLength = 10;
        }
        Poster[] all = getPosters();
        Poster[] tmp = new Poster[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            tmp[i] = all[all.length - 1 - i];
        }
        return tmp;
    }
}


