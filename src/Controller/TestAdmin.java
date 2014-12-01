/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Administrator;
import entities_DAO.AdministratorDAO;
import java.util.List;

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
        
        //TEST FOR DELETE
        /*Administrator admin=new Administrator("T20000002","nicknameadmin4","password4","addradmin4@gmail.com");
        System.out.println(adminDAO.delete(admin).getTnumber());*/
        
        //TEST FOR FIND ALL
         List<Administrator> admins0 = adminDAO.findAll();
        for (Administrator admin0 : admins0) {
            System.out.println(admin0.getTnumber() + " - " + admin0.getNickname() + " - " + admin0.getPassword());
    }
    }
}
