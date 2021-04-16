package com.migdal.songcupwebapplication.problemdomain;

import java.util.HashMap;
import java.util.Map;

public class SongStorage {

    private static Map<Integer, Song> songMap;

    private static final Track[] tracks = GetArtistsTopTracksExample.getArtistsTopTracks_Sync();

    public static Map<Integer, Song> createMap() {

        Song[] mySongs = new Song[10];
        for (int i = 0; i < 10; i++) {
            String[] titles = tracks[i].getName().split(" - ");
            String[] videos = tracks[i].getExternalUrls().toString().split("=");
            String[] videos2 = videos[2].split("}");
            mySongs[i] = new Song(i, titles[0], 0, videos2[0]);
        }

        Map<Integer, Song> mapSong = new HashMap<>();
        for (int i = 1; i < 9; i++) {
            mapSong.put(i, mySongs[i - 1]);
        }
        return mapSong;
    }

    public static Map<Integer, Song> getSongMap() {
        return songMap;
    }

    public static void setSongMap(Map<Integer, Song> songMap) {
        SongStorage.songMap = songMap;
    }
}
