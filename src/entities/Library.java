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
public class Library {
    private int id_library;
    private String member;
    private String name;
    
    public Library(int id_library, String member,String name){
        this.id_library=id_library;
        this.member=member;
        this.name=name;
    }
    
    public int get_id_library(){
        return id_library;
    }
        public void set_id_library(){
        this.id_library=id_library;
    }
        
    public String get_member(){
        return member;
    }
        public void set_member(){
        this.member=member;
    }
        
    public String get_name(){
        return name;
    }
        public void set_name(){
        this.member=name;
    }        
}
