/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities_DAO;

import entities.Followers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author t00178747
 */
public class FollowersDAO {
    
    
    private String nameDriver = "jdbc:oracle:thin:@cp3dbinstance.c4pxnpz4ojk8.us-east-1.rds.amazonaws.com:1521:cp3db";
    private String username = "mm3";
    private String password = "mm3";
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
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
    
    
    public Followers find(int id) {
        Followers followerUser = null;

        openConnection();
        try {
            this.resultSet = statement.executeQuery("SELECT * FROM FOLLOWERS WHERE ID_FOLLOWERSLIST = '" + id +"';");
            if (this.resultSet.first()) {
                followerUser = new Followers(
                        id,
                        this.resultSet.getString("tnumber")
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getErrorCode() + " error with the method find");
        }
        closeConnection();

        return followerUser;
    }

    public Followers create(Followers follower) {
        Followers newFollower = follower;
        String sql = " INSERT INTO FOLLOWERS(ID_FOLLOWERSLIST,TNUMBER"
                + " VALUES('" + newFollower.getId_followerslist()+"','" 
                + newFollower.getTnumber() +"');";
        
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
              System.out.println(ex.getErrorCode() + " error with the method create");
        }
        closeConnection();

        return newFollower;
    }

    public Followers update(Followers upFollower) {
        String sql = "UPDATE FOLLOWERS "
                +"SET ID_FOLLOWERSLIST='"+upFollower.getId_followerslist()+"',"
                +"SET TNUMBER='"+upFollower.getTnumber()+"';";
        
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException e) {
              System.out.println(e.getErrorCode() + " error with the method update");
        }
        closeConnection();

        return upFollower;
    }

    public void delete(Followers follower) {
        String sql = "DELETE FROM FOLLOWERS WHERE ID_FOLLOWERSLIST = '"+follower.getId_followerslist()+"';";
        
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
        }catch (SQLException ex) {
             System.out.println(ex.getErrorCode() + " error with the method find");
        }
    }

    public List<Followers> findAll() {
        List<Followers> followersList = new ArrayList();
        Followers follower = null;
        String sql = "SELECT * FROM FOLLOWERS";

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                follower = new Followers(
                        this.resultSet.getInt("id_followerslist"),
                        this.resultSet.getString("tnumber")
                        );
                followersList.add(follower);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the method findAll");
        }
        closeConnection();

        return followersList;
    }

}
