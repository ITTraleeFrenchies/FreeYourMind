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
public class Like_Music {
    private int id_likelist;
    private String tNumber;
    private String id_music;
    private Date date_creation;

    public Like_Music(int id_likelist, String tNumber, String id_music, Date date_creation) {
        this.id_likelist = id_likelist;
        this.tNumber = tNumber;
        this.id_music = id_music;
        this.date_creation = date_creation;
    }

    
    public int getId_likelist() {
        return id_likelist;
    }

    public void setId_likelist(int id_likelist) {
        this.id_likelist = id_likelist;
    }

    public String getTNumber() {
        return tNumber;
    }

    public void setTNumber(String tNumber) {
        this.tNumber = tNumber;
    }

    public String getId_music() {
        return id_music;
    }

    public void setId_music(String id_music) {
        this.id_music = id_music;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }
    
    
    
}
