package day10.collection.song;

import day04.array.StringList;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArtistRepository {

    // key: 가수의 이름, value: 가수 객체
    public static Map<String, Artist> artistList; // 가수 배열

    static {
        artistList = new HashMap<>();
    }

    // 신규 가수를 첫 노래와 함께 배열에 추가하는 기능
    public void addNewArtist(String artistName, String songName) {
//        // 1. 가수 객체 생성
//        Artist artist = new Artist();
//
//        // 2. 생성된 가수 객체에 전달받은 이름 셋팅
//        artist.setName(artistName);
//
//        // 3. 생성된 가수 객체에 노래 목록 생성해서 셋팅
//        artist.setSongList(new StringList());
//
//        // 4. 해당 노래목록에 전달받은 노래 추가
//        artist.getSongList().push(songName);

        Artist artist = new Artist(artistName, new HashSet<>());
        artist.getSongList().add(songName);

        // 5. 가수맵에 해당 가수 객체 추가
        artistList.put(artist.getName(), artist);

        // 6. 세이브파일에 저장
        autoSave();
    }

    // 가수명을 받아서 해당 가수가 등록된 가수인지 확인하는 기능
    public boolean isRegistered(String artistName) {
        return artistList.containsKey(artistName);
    }

    // 가수명을 통해 가수 객체 정보를 반환하는 기능
    public Artist findArtistByName(String artistName) {
        return artistList.get(artistName);
    }

    // 기존 가수 객체에 노래를 추가하는 기능
    public boolean addNewSong(String artistName, String songName) {
        Artist artist = findArtistByName(artistName);
        boolean flag = artist.getSongList().add(songName);
        if (flag) autoSave();
        return flag;
    }

    // 특정 가수의 노래목록을 반환하는 기능
    public Set<String> getSongList(String artistName) {
        return findArtistByName(artistName).getSongList();
    }

    // 등록된 가수의 수 반환
    public int count() {
        return artistList.size();
    }


    // 자동 세이브 기능
    public void autoSave() {

        File f = new File("D:/music");
        if (!f.exists()) f.mkdir();

        try (ObjectOutputStream oos
                     = new ObjectOutputStream(
                new FileOutputStream("D:/music/m.sav")
        )) {
            oos.writeObject(artistList);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    // 자동 로드 기능
    public static void loadFile() {

        // 세이브파일이 존재한다면
        File f = new File("D:/music/m.sav");

        if (f.exists()) {
            // 로드해라~
            try (ObjectInputStream ois =
                         new ObjectInputStream(
                                 new FileInputStream(f)
                         )) {

                artistList = (Map<String, Artist>) ois.readObject();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }

}