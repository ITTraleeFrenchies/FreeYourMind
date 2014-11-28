/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Administrator;
import entities_DAO.AdministratorDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author t00178764
 */
public class TestAdmin {
    public static void main(String[] args) {
        AdministratorDAO adminDAO = new AdministratorDAO();
        
        //TEST FOR FIND BY TNUMBER
       /* Administrator admin = adminDAO.findByTnumber("T20000000");
        System.out.println(admin.getNickname()); */
        
        //TEST FOR CREATE
        /*Administrator admin = new Administrator("T20000002","nicknameadmin3","password3","addradmin3@gmail.com");
        System.out.println(adminDAO.create(admin).getTnumber());*/
        
        //TEST FOR UPDATE
        /*Administrator admin=new Administrator("T20000002","nicknameadmin4","password4","addradmin4@gmail.com");
        adminDAO.update(admin);*/
        
        //
    }
    
}
