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
    private int IDFollowlist;
    private String Tnumber;
    private String NicknameFollowed;
    
    public Follow(int IDFollowlist, String Tnumber, String NicknameFollowed) {
        this.IDFollowlist = IDFollowlist;
        this.Tnumber = Tnumber;
        this.NicknameFollowed = NicknameFollowed;
    }

    public int getIDFollowlist() {
        return IDFollowlist;
    }

    public void setIDFollowlist(int IDFollowlist) {
        this.IDFollowlist = IDFollowlist;
    }

    public String getTnumber() {
        return Tnumber;
    }

    public void setTnumber(String Tnumber) {
        this.Tnumber = Tnumber;
    }

    public String getNicknameFollowed() {
        return NicknameFollowed;
    }

    public void setNicknameFollowed(String NicknameFollowed) {
        this.NicknameFollowed = NicknameFollowed;
    }
    

    
    
    
}
