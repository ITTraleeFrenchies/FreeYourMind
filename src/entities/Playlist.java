/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.util.Date;

/**
 *
 * @author t00178760
 */
public class Playlist {
    private String IDPlaylist;
    private int IDLibrary;
    private String Name;
    private Date CreationDate;
    private boolean Hidden;

    public Playlist(String IDPlaylist, int IDLibrary, String Name, Date CreationDate, boolean Hidden) {
        this.IDPlaylist = IDPlaylist;
        this.IDLibrary = IDLibrary;
        this.Name = Name;
        this.CreationDate = CreationDate;
        this.Hidden = Hidden;
    }

    public String getIDPlaylist() {
        return IDPlaylist;
    }

    public void setIDPlaylist(String IDPlaylist) {
        this.IDPlaylist = IDPlaylist;
    }

    public int getIDLibrary() {
        return IDLibrary;
    }

    public void setIDLibrary(int IDLibrary) {
        this.IDLibrary = IDLibrary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date CreationDate) {
        this.CreationDate = CreationDate;
    }

    public boolean isHidden() {
        return Hidden;
    }

    public void setHidden(boolean Hidden) {
        this.Hidden = Hidden;
    }
    
    
}
