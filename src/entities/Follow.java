/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;


/**
 *
 * @author t00178730
 */
public class Follow {
    private int idFollowlist;
    private String tnumber;
    private String nicknameFollowed;
    
    public Follow(int idFollowlist, String tnumber, String nicknameFollowed) {
        this.idFollowlist = idFollowlist;
        this.tnumber = tnumber;
        this.nicknameFollowed = nicknameFollowed;
    }

    public Follow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIDFollowlist() {
        return idFollowlist;
    }

    public void setIDFollowlist(int idFollowlist) {
        this.idFollowlist = idFollowlist;
    }

    public String getTnumber() {
        return tnumber;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber;
    }

    public String getNicknameFollowed() {
        return nicknameFollowed;
    }

    public void setNicknameFollowed(String nicknameFollowed) {
        this.nicknameFollowed = nicknameFollowed;
    }
    

    
    
    
}
