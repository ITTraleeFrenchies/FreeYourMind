/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities_DAO;

import Controller.ConnectionDatabaseManager;
import entities.Administrator;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author t00178747
 */
public class AdministratorDAO{
    
    private String nameDriver = "jdbc:oracle:thin:@cp3dbinstance.c4pxnpz4ojk8.us-east-1.rds.amazonaws.com:1521:cp3db";
    private String username = "mm3";
    private String password = "mm3";
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public AdministratorDAO(){
        
    }
    
     public void openConnection() {
        try {
            this.connection = DriverManager.getConnection(nameDriver, username, password);
            this.statement = connection.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " : error with the openning of  connection. ");
        }
    }

    public void closeConnection() {
        try {
            if (this.connection != null && this.statement != null && this.resultSet != null) {
                this.connection.close();
                this.statement.close();
                this.resultSet.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " : error with the closing of connection. ");
        }

    }

    public Administrator create(Administrator adminToCreate) {
        Administrator admin = adminToCreate;
        String sql = " INSERT INTO ADMINISTRATOR(TNUMBER,NICKNAME,PASSWORD,EMAIL_ADDRESS)"+
                "VALUES('" + adminToCreate.getTnumber() + "','"
                + adminToCreate.getNickname() + "','" + adminToCreate.getPassword() + 
                "','" + adminToCreate.getEmail_address() + "')";
                
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();

        return admin;
    }

public Administrator update(Administrator adminUpdate) {

        String sql = " UPDATE ADMINISTRATOR SET NICKNAME = '" + adminUpdate.getNickname()
                + "', PASSWORD = '" + adminUpdate.getPassword()
                + "', EMAIL_ADDRESS = '" + adminUpdate.getEmail_address()
                + "' WHERE TNUMBER = '" + adminUpdate.getTnumber() + "'";
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();

        return adminUpdate;
    }

    public Administrator delete(Administrator adminToDelete) {
        String sql = "DELETE FROM ADMINISTRATOR WHERE TNUMBER = '" + adminToDelete.getTnumber() + "'";
        System.out.println(sql);
        
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();
        
        return adminToDelete;
    }

    public List<Administrator> findAll() {
        return null;
    }

    public Administrator findByTnumber(String tnumber) {

        Administrator admin = null;
        String sql = "SELECT * FROM ADMINISTRATOR WHERE TNUMBER = '" + tnumber + "'";
        
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                admin = new Administrator(
                        this.resultSet.getString("tnumber"),
                        this.resultSet.getString("nickname"),
                        this.resultSet.getString("password"),
                        this.resultSet.getString("email_address")
                );
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the sql request.");
        }
        closeConnection();

        return admin;
    }
    
}
