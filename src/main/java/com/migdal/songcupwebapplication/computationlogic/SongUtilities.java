//package com.migdal.songcupwebapplication.computationlogic;
//
//import com.migdal.songcupwebapplication.buildlogic.SongCupBuildLogic;
//import com.migdal.songcupwebapplication.problemdomain.Song;
//import com.migdal.songcupwebapplication.problemdomain.SongStorage;
//
//import java.util.*;
//
//public class SongUtilities {
//
//    private static final Map<Integer, Integer> mapForButtonOne = createMapForButtonOne();
//    private static final Map<Integer, Integer> mapForButtonTwo = createMapForButtonTwo();
//    private static final List<Song> playlist = new ArrayList<Song>();
//
//    public static Map<Integer, Integer> getMapForButtonOne() {
//        return mapForButtonOne;
//    }
//
//    public static Map<Integer, Integer> getMapForButtonTwo() {
//        return mapForButtonTwo;
//    }
//
//    public static String getTitleSongOne() {
//        return SongStorage.getSongMap().get(getMapForButtonOne().get(SongCupBuildLogic.getMatch())).getTitle();
//    }
//
//    public static String getTitleSongTwo() {
//        return SongStorage.getSongMap().get(getMapForButtonTwo().get(SongCupBuildLogic.getMatch())).getTitle();
//    }
//
//    public static String getVideoSongOne() {
//        return SongStorage.getSongMap().get(getMapForButtonOne().get(SongCupBuildLogic.getMatch())).getVideo();
//    }
//
//    public static String getVideoSongTwo() {
//        return SongStorage.getSongMap().get(getMapForButtonTwo().get(SongCupBuildLogic.getMatch())).getVideo();
//    }
//
//    public static void setPointOne() {
//        SongStorage.getSongMap().get(getMapForButtonOne().get(SongCupBuildLogic.getMatch()))
//                .setPoint(SongStorage.getSongMap().get(getMapForButtonOne().get(SongCupBuildLogic.getMatch())).getPoint()+1);
//    }
//
//    public static void setPointTwo() {
//        SongStorage.getSongMap().get(getMapForButtonTwo().get(SongCupBuildLogic.getMatch()))
//                .setPoint(SongStorage.getSongMap().get(getMapForButtonTwo().get(SongCupBuildLogic.getMatch())).getPoint()+1);
//    }
//
//
//    public static Map<Integer, Song> createNewMap() {
//        Map<Integer, Song> newSongMap = new HashMap<>();
//        int id = 0;
//        for (Map.Entry<Integer, Song> entry : SongStorage.getSongMap().entrySet()) {
//            if (entry.getValue().getPoint() > 0) {
//                id++;
//                newSongMap.put(id, entry.getValue());
//            }
//        }
//        return newSongMap;
//    }
//
//    public static Map<Integer, Song> createNewMap2() {
//        Map<Integer, Song> newSongMap2 = new HashMap<>();
//        int id = 0;
//        for (Map.Entry<Integer, Song> entry : SongStorage.getSongMap().entrySet()) {
//            if (entry.getValue().getPoint() > 1) {
//                id++;
//                newSongMap2.put(id, entry.getValue());
//            }
//        }
//        return newSongMap2;
//    }
//
//    public static Map<Integer, Song> createFinalMap() {
//        Map<Integer, Song> newSongMap = new HashMap<>();
//        int id = 0;
//        for (Map.Entry<Integer, Song> entry : SongStorage.getSongMap().entrySet()) {
//            if (entry.getValue().getPoint() > 2) {
//                id++;
//                newSongMap.put(id, entry.getValue());
//            }
//        }
//        return newSongMap;
//    }
//
//    public static Map<Integer, Integer> createMapForButtonOne() {
//        Map<Integer, Integer> mapForButtonOne = new HashMap<>();
//        int value = 1;
//        int iterator = 1;
//        for (int i = 0; i < 8; i++) {
//            if (iterator == 5 || iterator == 7 || iterator == 8 ) {
//                value = 1;
//            }
//            mapForButtonOne.put(i, value);
//            value = value + 2;
//            iterator++;
//        }
//        return mapForButtonOne;
//    }
//
//    public static Map<Integer, Integer> createMapForButtonTwo() {
//        Map<Integer, Integer> mapForButtonTwo = new HashMap<>();
//        int value = 2;
//        int iterator = 1;
//        for (int i = 0; i < 8; i++) {
//            if (iterator == 5 || iterator == 7 || iterator == 8 ) {
//                value = 2;
//            }
//            mapForButtonTwo.put(i, value);
//            value = value + 2;
//            iterator++;
//        }
//        return mapForButtonTwo;
//    }
//
//    public static void addPlaylist (int point) {
//        for (Map.Entry<Integer, Song> entry : SongStorage.getSongMap().entrySet()) {
//            if (entry.getValue().getPoint() == point) {
//                playlist.add(entry.getValue());
//            }
//        }
//    }
//
//    public static StringBuilder showPlaylist () {
//        playlist.sort(Comparator.comparing(Song::getPoint).reversed());
//        StringBuilder sB = new StringBuilder();
//        for (Song entry : playlist) {
//            sB.append(entry.getTitle());
//            sB.append("\n");
//        }
//        return sB;
//    }
//}
