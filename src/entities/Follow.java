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
    private String IDFollowlist;
    private int Tnumber;
    private int NicknameFollowed;
    
    public Follow(String IDFollowlist, int Tnumber, int NicknameFollowed) {
        this.IDFollowlist = IDFollowlist;
        this.Tnumber = Tnumber;
        this.NicknameFollowed = NicknameFollowed;
    }
    
    public String getIDFollowlist() {
        return IDFollowlist;
    }

    public void setIDFollowlist(String IDFollowlist) {
        this.IDFollowlist = IDFollowlist;
    }

    public int getTnumber() {
        return Tnumber;
    }
        
    public void setTnumber(int Tnumber) {
        this.Tnumber = Tnumber;
    }

    public int getNicknameFollowed() {
        return NicknameFollowed;
    }

    public void setNicknameFollowed(int NicknameFollowed) {
        this.NicknameFollowed = NicknameFollowed;
    }
    
    
    
}
