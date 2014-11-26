/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities_DAO.MemberDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TestEverything {

    

    public static void main(String[] args) {
        ConnectionDatabaseManager connect = new ConnectionDatabaseManager();
        MemberDAO memberDAO= new MemberDAO(connect);
       
        memberDAO.find("T10000000");
        connect.closeConnection();
        
    }
}
