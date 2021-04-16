package com.migdal.songcupwebapplication.problemdomain;

public class Song {
    private int popularity;
    private final String title;
    private int point;
    private final String video;

    public Song (int popularity, String title, int point, String video) {
        this.popularity = popularity;
        this.title = title;
        this.point = point;
        this.video = video;
    }

    public String getTitle() {
        return title;
    }

    public String getVideo() {
        return video;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
