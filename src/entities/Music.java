/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.sql.Blob;
import java.util.Date;

/**
 *
 * @author t00178760
 */
public class Music {
    private String IDTrack;
    private String IDPlaylist;
    private String Title;
    private int TrackNumber;
    private String Artist;
    private String AlbumTitle;
    private String TypeMusic;
    private Date ReleaseYear;
    private Blob music_file;

    public Music(String IDTrack, String IDPlaylist, String Title, int TrackNumber, String Artist, String AlbumTitle, String TypeMusic, Date ReleaseYear, Blob music_file) {
        this.IDTrack = IDTrack;
        this.IDPlaylist = IDPlaylist;
        this.Title = Title;
        this.TrackNumber = TrackNumber;
        this.Artist = Artist;
        this.AlbumTitle = AlbumTitle;
        this.TypeMusic = TypeMusic;
        this.ReleaseYear = ReleaseYear;
        this.music_file = music_file;
    }

    public String getIDTrack() {
        return IDTrack;
    }

    public void setIDTrack(String IDTrack) {
        this.IDTrack = IDTrack;
    }

    public String getIDPlaylist() {
        return IDPlaylist;
    }

    public void setIDPlaylist(String IDPlaylist) {
        this.IDPlaylist = IDPlaylist;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getTrackNumber() {
        return TrackNumber;
    }

    public void setTrackNumber(int TrackNumber) {
        this.TrackNumber = TrackNumber;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public String getAlbumTitle() {
        return AlbumTitle;
    }

    public void setAlbumTitle(String AlbumTitle) {
        this.AlbumTitle = AlbumTitle;
    }

    public String getTypeMusic() {
        return TypeMusic;
    }

    public void setTypeMusic(String TypeMusic) {
        this.TypeMusic = TypeMusic;
    }

    public Date getReleaseYear() {
        return ReleaseYear;
    }

    public void setReleaseYear(Date ReleaseYear) {
        this.ReleaseYear = ReleaseYear;
    }

    public Blob getMusic_file() {
        return music_file;
    }

    public void setMusic_file(Blob music_file) {
        this.music_file = music_file;
    }
    
    
    
}
