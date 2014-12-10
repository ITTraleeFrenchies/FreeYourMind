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
    
    
    public Followers findFollowed(String tnumber) {
        Followers followersUser = null;

        openConnection();
        try {
            this.resultSet = statement.executeQuery("SELECT * FROM FOLLOWERS WHERE TNUMBER = '" + tnumber +"'");
            if (this.resultSet.next()) {
                followersUser = new Followers(
                        this.resultSet.getInt("id_followerslist"),
                        tnumber,
                        this.resultSet.getString("tnumber_Follow")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();

        return followersUser;
    }
    
    public Followers findFollower(String tnumber) {
        Followers followersUser = null;

        openConnection();
        try {
            this.resultSet = statement.executeQuery("SELECT * FROM FOLLOWERS WHERE TNUMBER_FOLLOW = '" + tnumber +"'");
            if (this.resultSet.next()) {
                followersUser = new Followers(
                        this.resultSet.getInt("id_followerslist"),
                        this.resultSet.getString("tnumber"),
                        tnumber
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();

        return followersUser;
    }

    public Followers create(Followers follower) {
        Followers newFollower = follower;
        String sql = " INSERT INTO FOLLOWERS(ID_FOLLOWERSLIST,TNUMBER,TNUMBER_FOLLOW)"
                + " VALUES('" + newFollower.getId_followerslist()+"','" 
                + newFollower.getTnumber() +"','" + newFollower.getTnumber_follow() +"');";
        
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
                +"SET TNUMBER='"+upFollower.getTnumber()+"';"
                +"SET TNUMBER_FOLLOW='"+upFollower.getTnumber_follow()+"';"
                ;
        
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
                        this.resultSet.getString("tnumber"),
                         this.resultSet.getString("tnumber_follow")
                        );
                followersList.add(follower);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the method findAll");
        }
        closeConnection();

        return followersList;
    }
    
    public int count(){
        int count=0;
        String sql="SELECT COUNT(*) FROM FOLLOWERS";
        
        try {
            this.resultSet = statement.executeQuery(sql);
            count=this.resultSet.getInt("count(*)");
            }catch (SQLException ex) {
             System.out.println(ex.getErrorCode() + " error with the method find");
        }
        return count;
    }

}
