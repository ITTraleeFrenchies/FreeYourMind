/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities_DAO;

import Controller.ConnectionDatabaseManager;
import entities.Blocked;
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
public class BlockedDAO {
    private String nameDriver = "jdbc:oracle:thin:@cp3dbinstance.c4pxnpz4ojk8.us-east-1.rds.amazonaws.com:1521:cp3db";
    private String username = "mm3";
    private String password = "mm3";
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    public BlockedDAO(){
        
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

    public Blocked find(int id) {
        Blocked blocked = null;
        String sql = "SELECT * FROM BLOCKED WHERE ID_BLOCKED = '" + id + "'";
        
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                blocked = new Blocked(
                        this.resultSet.getInt("id_blocked"),
                        this.resultSet.getString("tnumber_admin"),
                        this.resultSet.getString("tnumber_user")
                );
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the sql request.");
        }
        closeConnection();

        return blocked;
    }

    public Blocked create(Blocked blockedToCreate) {
        Blocked blocked = blockedToCreate;
        String sql = " INSERT INTO BLOCKED"+
                "VALUES('" + blockedToCreate.get_id_blocked() + "','"
                + blockedToCreate.get_tNumber_admin() + "','" + blockedToCreate.get_tNumber_user() + 
                 "')";
                
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();

        return blocked;
    }

    public Blocked update(Blocked blockedToUpdate) {
        String sql = " UPDATE BLOCKED SET ID_BLOCKED = '" + blockedToUpdate.get_id_blocked()
                + "', TNUMBER_ADMIN = '" + blockedToUpdate.get_tNumber_admin()
                + "', TNUMBER_USER = '" + blockedToUpdate.get_tNumber_user()+ "'";
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();

        return blockedToUpdate;
    }

    public Blocked delete(Blocked blockedToDelete) {
        String sql = "DELETE FROM BLOCKED WHERE ID_BLOCKED = '" + blockedToDelete.get_id_blocked() + "'";
        System.out.println(sql);
        
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();
        
        return blockedToDelete;
    }

    public List<Blocked> findAll() {
        List<Blocked> blocked_users = new ArrayList();
        Blocked blocked = null;
        
        String sql="SELECT * FROM BLOCKED";
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                blocked = new Blocked(
                        this.resultSet.getInt("id_blocked"),
                        this.resultSet.getString("tnumber_admin"),
                        this.resultSet.getString("tnumber_user")
                        );
                blocked_users.add(blocked);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the sql request.");
        }
        closeConnection();
        
        
        return blocked_users;
    }


}
