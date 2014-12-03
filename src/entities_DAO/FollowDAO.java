/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities_DAO;

import entities.Follow;
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
public class FollowDAO {
    
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
    
    public Follow find(int id) {
        Follow followUser = null;

        openConnection();
        try {
            this.resultSet = statement.executeQuery("SELECT * FROM FOLLOW WHERE ID_FOLLOWLIST = '" + id +"';");
            if (this.resultSet.first()) {
                followUser = new Follow(
                        id,
                        this.resultSet.getString("tnumber"),
                        this.resultSet.getString("nickname_followed")
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getErrorCode() + " error with the method find");
        }
        closeConnection();

        return followUser;
    }

    public Follow create(Follow follow) {
        Follow newFollow = follow;
        String sql = " INSERT INTO FOLLOW(ID_FOLLOWLIST,TNUMBER,NICKNAME_FOLLOWED"
                + " VALUES('" + newFollow.getIDFollowlist()+"','" 
                + newFollow.getTnumber() +"','"+newFollow.getNicknameFollowed()+"');";
        
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
              System.out.println(ex.getErrorCode() + " error with the method create");
        }
        closeConnection();

        return newFollow;
    }

    public Follow update(Follow upFollow) {
        String sql = "UPDATE FOLLOW "
                +"SET ID_FOLLOWLIST='"+upFollow.getIDFollowlist()+"',"
                +"SET TNUMBER='"+upFollow.getTnumber()+"',"
                +"SET NICKNAME_FOLLOWED='"+upFollow.getNicknameFollowed()+"';";
        
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException e) {
              System.out.println(e.getErrorCode() + " error with the method update");
        }
        closeConnection();

        return upFollow;
    }

    public void delete(Follow follow) {
        String sql = "DELETE FROM FOLLOW WHERE ID_FOLLOWLIST = '"+follow.getIDFollowlist()+"';";
        
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
        }catch (SQLException ex) {
             System.out.println(ex.getErrorCode() + " error with the method find");
        }
    }

    public List<Follow> findAll() {
        List<Follow> followedList = new ArrayList();
        Follow follow = null;
        String sql = "SELECT * FROM FOLLOW";

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                follow = new Follow(
                        this.resultSet.getInt("id_followlist"),
                        this.resultSet.getString("tnumber"),
                        this.resultSet.getString("nickname_followed")
                        );
                followedList.add(follow);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the method findAll");
        }
        closeConnection();

        return followedList;
    }

}
