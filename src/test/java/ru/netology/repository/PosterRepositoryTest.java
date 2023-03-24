package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.data.Poster;


public class PosterRepositoryTest {
    PosterRepository repo = new PosterRepository();

    Poster poster1 = new Poster(1, "Зловещие мертвецы");
    Poster poster2 = new Poster(2, "Зловещие мертвецы 2");
    Poster poster3 = new Poster(3, "Зловещие мертвецы 3");
    Poster poster4 = new Poster(4, "Такси");
    Poster poster5 = new Poster(5, "Такси 2");
    Poster poster6 = new Poster(6, "Такси 3");
    Poster poster7 = new Poster(7, "Такси 4");
    Poster poster8 = new Poster(8, "Матрица");
    Poster poster9 = new Poster(9, "Матрица 2");
    Poster poster10 = new Poster(10, "Матрица 3");
    Poster poster11 = new Poster(11, "Назад в будущее");
    Poster poster12 = new Poster(12, "Назад в будущее 2");
    Poster poster13 = new Poster(13, "Назад в будущее 3");
    Poster poster14 = new Poster(14, "1408");


    @Test

    public void addPosters() {

        repo.save(poster1);
        repo.save(poster5);
        repo.save(poster4);
        repo.save(poster7);
        repo.save(poster9);
        Poster[] expected = {poster1, poster5, poster4, poster7, poster9};
        Poster[] actual = repo.getPosters();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findAll() {
        repo.save(poster1);
        repo.save(poster5);
        repo.save(poster4);
        repo.save(poster7);
        repo.save(poster9);
        repo.save(poster2);
        repo.save(poster3);
        repo.save(poster6);
        repo.save(poster8);
        repo.save(poster10);
        repo.save(poster11);
        repo.save(poster12);
        repo.save(poster13);
        repo.save(poster14);

        Poster[] expected = {poster1, poster5, poster4, poster7, poster9, poster2, poster3, poster6, poster8, poster10, poster11, poster12, poster13, poster14};
        Poster[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLastDefault() {
        repo.save(poster1);
        repo.save(poster5);
        repo.save(poster4);
        repo.save(poster7);
        repo.save(poster9);
        repo.save(poster2);
        repo.save(poster3);
        repo.save(poster6);
        repo.save(poster8);
        repo.save(poster10);
        repo.save(poster11);
        repo.save(poster12);
        repo.save(poster13);
        repo.save(poster14);
        Poster[] expected = {poster14, poster13, poster12, poster11, poster10, poster8, poster6, poster3, poster2, poster9};
        Poster[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastManualMoreLimit() {
        PosterRepository repo = new PosterRepository(4);
        repo.save(poster1);
        repo.save(poster5);
        repo.save(poster4);
        repo.save(poster7);
        repo.save(poster9);
        repo.save(poster2);
        repo.save(poster3);
        repo.save(poster6);
        repo.save(poster8);
        repo.save(poster10);
        Poster[] expected = {poster10, poster8, poster6, poster3};
        Poster[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLastManualLimit() {
        PosterRepository repo = new PosterRepository(4);

        repo.save(poster11);
        repo.save(poster12);
        repo.save(poster13);
        repo.save(poster14);
        Poster[] expected = {poster14, poster13, poster12, poster11};
        Poster[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void findLastManuallessThanTheLimit() {
        PosterRepository repo = new PosterRepository(4);

        repo.save(poster12);
        repo.save(poster13);
        repo.save(poster14);
        Poster[] expected = {poster14, poster13, poster12, null};
        Poster[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }



}