/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author t00178747
 */
public class Like_Playlist {

    int id_likelist;
    private String TNumber;
    private String id_playlist;
    private Date date_creation;

    public Like_Playlist(int id_likelist, String TNumber, String id_playlist, Date date_creation) {
        this.id_likelist = id_likelist;
        this.TNumber = TNumber;
        this.id_playlist = id_playlist;
        this.date_creation = date_creation;
    }
    
    

    public int getId_likelist() {
        return id_likelist;
    }

    public void setId_likelist(int id_likelist) {
        this.id_likelist = id_likelist;
    }

    public String getTNumber() {
        return TNumber;
    }

    public void setTNumber(String TNumber) {
        this.TNumber = TNumber;
    }

    public String getId_playlist() {
        return id_playlist;
    }

    public void setId_playlist(String id_playlist) {
        this.id_playlist = id_playlist;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }
    
}
