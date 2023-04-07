package day10.collection.song;

import day04.array.StringList;

import java.util.Set;

public class Artist {

    private String name;  // 가수 이름
    private Set<String> songList; // 노래 목록

    public Artist() {

    }

    public Artist(String name, Set<String> songList) {
        this.name = name;
        this.songList = songList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getSongList() {
        return songList;
    }

    public void setSongList(Set<String> songList) {
        this.songList = songList;
    }

    // 가수의 정보를 출력하는 기능
    public void info() {
        System.out.println("가수명: " + this.name);
        System.out.println("노래 목록: " + this.songList);
    }

}