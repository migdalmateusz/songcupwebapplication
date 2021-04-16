package com.migdal.songcupwebapplication.buildlogic;

public class SongCupBuildLogic {

    private static int match = 0;

    public static int getMatch() {
        return match;
    }

    public static void increaseMatch() {
        match++;
    }

    public static void countAndCheck() {
        if (match == 4) {
            SongUtilities.addPlaylist(0);
            SongStorage.setSongMap(SongUtilities.createNewMap());
        } else if (match == 6) {
            SongUtilities.addPlaylist(1);
            SongStorage.setSongMap(SongUtilities.createNewMap2());
        }
    }
}
