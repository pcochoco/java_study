package com.pcochoco.java_study.collection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Music implements Comparable<Music>{ //정렬을 위해 필요
    private String title;
    private String artist;
    private int ranking;

    public Music(String title, String artist, int ranking) {
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
    public int compareTo(Music m) {
        //기본은 Object -> Music o로 지정
        //정렬의 기준을 잡음

        //같으면 0

        //this이 매개 객체보다 뒤(크면) 양

        //this이 매개 객체보다 앞(작으면) 음

        //ranking 기준 정렬이므로
        return this.ranking - m.ranking;
    }
}
