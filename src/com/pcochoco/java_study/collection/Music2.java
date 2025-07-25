package com.pcochoco.java_study.collection;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Music2 implements Comparable<Music2>{ //정렬을 위해 필요
    private String title;
    private String artist;
    private int ranking;

    public Music2(String title, String artist, int ranking) {
        this.title = title;
        this.artist = artist;
        this.ranking = ranking;
    }

    @Override
    public String toString(){
        return "Music{" +
                "title = '" + title + '\'' +
                ", artist = '" + artist + '\'' +
                "ranking = '" + ranking + '\'';
    }

    @Override //implements Comparable이므로 compareTo 추상 메서드 필요
    public int compareTo(Music2 m) {
        //기본은 Object -> Music o로 지정
        //정렬의 기준을 잡음

        //같으면 0

        //this이 매개 객체보다 뒤(크면) 양

        //this이 매개 객체보다 앞(작으면) 음

        //ranking 기준 정렬이므로
        return this.ranking - m.ranking;
    }

    @Override
    public boolean equals(Object o){
        if(o == null || getClass() != o.getClass()) return false;
        Music2 music2 = (Music2) o;
        return ranking == music2.ranking && Objects.equals(title, music2.title) && Objects.equals(artist, music2.artist);
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, artist, ranking);
    }
}
