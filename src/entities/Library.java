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

    public Library(int id_library, String member, String name) {
        this.id_library = id_library;
        this.member = member;
        this.name = name;
    }

    public Library() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_library() {
        return id_library;
    }

    public void setId_library(int id_library) {
        this.id_library = id_library;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
