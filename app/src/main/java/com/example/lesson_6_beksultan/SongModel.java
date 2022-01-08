package com.example.lesson_6_beksultan;

public class SongModel {
    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSingerSong() {
        return singerSong;
    }

    public void setSingerSong(String singerSong) {
        this.singerSong = singerSong;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String nameSong, singerSong, number, time;

    public SongModel(String nameSong, String singerSong, String number, String time) {
        this.nameSong = nameSong;
        this.singerSong = singerSong;
        this.number = number;
        this.time = time;
    }
}
