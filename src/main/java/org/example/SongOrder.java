package org.example;

public class SongOrder {
    private String singer;
    private String songName;

    public static SongOrder of(String singer) {
        return new SongOrder(singer);
    }

    public static SongOrder of(String singer, String songName) {
        return new SongOrder(singer, songName);
    }

    public String getSinger() {
        return singer;
    }

    public SongOrder setSinger(String singer) {
        this.singer = singer;
        return this;
    }

    public String getSongName() {
        return songName;
    }

    public SongOrder setSongName(String songName) {
        this.songName = songName;
        return this;
    }

    @Override
    public String toString() {
        if (singer == null && songName == null) {
            return "You haven't chosen a singer. Please make your choice)";
        } else if (songName == null) {
            return "Play any " + singer + " song";
        }
        return "Play " + singer + " song called \"" + songName + "\"";
    }

    private SongOrder(String singer) {
        this.singer = singer;
    }

    private SongOrder(String singer, String songName) {
        this.singer = singer;
        this.songName = songName;
    }
}
