/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

/**
 *
 * @author t00178747
 */
public class Followers {
    private int id_followerslist;
    private String Tnumber;

    public Followers(int id_followerslist, String Tnumber) {
        this.id_followerslist = id_followerslist;
        this.Tnumber = Tnumber;
    }

    
    public int getId_followerslist() {
        return id_followerslist;
    }

    public void setId_followerslist(int id_followerslist) {
        this.id_followerslist = id_followerslist;
    }

    public String getTnumber() {
        return Tnumber;
    }

    public void setTnumber(String Tnumber) {
        this.Tnumber = Tnumber;
    }
    
    
}
