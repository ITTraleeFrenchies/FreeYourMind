/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import entities.Blocked;
import entities_DAO.BlockedDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author t00178764
 */
public class TestBlocked {
   public static void main(String[] args) {
        BlockedDAO blockedDAO = new BlockedDAO();
        
        //TEST FOR FIND BY TNUMBER
        /*Blocked blocked = blockedDAO.find(21);
        System.out.println(blocked.get_tNumber_admin());*/
        
        //TEST FOR CREATE
        /*Blocked blocked = new Blocked(0,"T20000002","T10000000"); 
        System.out.println(blockedDAO.create(blocked).get_id_blocked());*/
        
        //TEST FOR UPDATE
        /*Blocked blocked=new Blocked(11,"T20000000","T10000001");//wrong id, need to be changed when db available
        blockedDAO.update(blocked);*/
        
        //TEST FOR DELETE
        /*Blocked blocked=new Blocked(11,"T20000000","T10000001");//wrong id, need to be changed when db available
        System.out.println(blockedDAO.delete(blocked).get_id_blocked());*/
        
        //TEST FOR FIND ALL
        /* List<Blocked> blockeds0 = blockedDAO.findAll();
        for (Blocked blocked0 : blockeds0) {
            System.out.println(blocked0.get_id_blocked() + " - " + blocked0.get_tNumber_admin() + " - " + blocked0.get_tNumber_user());
    }*/
    } 
}
