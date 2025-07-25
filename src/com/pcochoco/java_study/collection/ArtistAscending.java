package com.pcochoco.java_study.collection;

import java.util.Comparator;

public class ArtistAscending implements Comparator<Music>{
    @Override
    public int compare(Music m1, Music m2) {
        //객체 비교 용도

        return m1.getRanking() - m2.getRanking();
        //return m1.getArtist().compareTo(m2.getArtist());
    }
}
