/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

/**
 *
 * @author t00178764
 */
public class Blocked {
    private int id_blocked;
    private String tNumber_admin;
    private String tNumber_user;
    
    public Blocked(int id_blocked, String tNumber_admin,String tNumber_user){
        this.id_blocked=id_blocked;
        this.tNumber_admin=tNumber_admin;
        this.tNumber_user=tNumber_user;
    }
    
    public int get_id_blocked(){
        return id_blocked;
    }
    public void set_id_blocked(){
        this.id_blocked=id_blocked;
    }
    
    public String get_tNumber_admin(){
        return tNumber_admin;
    }
    public void set_tNumber_admin(){
        this.tNumber_admin=tNumber_admin;
    }
    
    public String get_tNumber_user(){
        return tNumber_user;
    }
    public void set_tNumber_user(){
        this.tNumber_user=tNumber_user;
    }
    
}
