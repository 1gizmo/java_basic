package day09.quiz2;

import day04.array.StringList;

public class Test {
    public static void main(String[] args) {
    // 가수 객체 생성
    Artist artist = new Artist("동방신기",new StringList("hug"));


    // 객체 생성 이후에 노래를 추가하고 싶으면
//        StringList stringList = artist.getSongList();
//        stringList.push("mirotic");



    artist.info();
    }


}
