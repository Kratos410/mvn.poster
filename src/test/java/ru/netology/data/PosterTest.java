package ru.netology.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {
    Poster newPoster = new  Poster();


    @Test

    public void name(){
       newPoster.setNamePoster("matrix");
       String expected ="matrix" ;
       String actual = newPoster.getNamePoster();
       Assertions.assertEquals(expected, actual);

    }

    @Test

    public void id(){
        newPoster.setId(2);
        int expected =2 ;
        int actual = newPoster.getId();
        Assertions.assertEquals(expected, actual);

    }
}
