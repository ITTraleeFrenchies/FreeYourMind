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
    
    public Follow find(String tnumber) {
        Follow followUser = null;

        openConnection();
        try {
            this.resultSet = statement.executeQuery("SELECT * FROM FOLLOW WHERE TNUMBER = '" + tnumber +"'");
            if (this.resultSet.next()) {
                followUser = new Follow(
                        this.resultSet.getInt("id_followlist"),
                        tnumber,
                        this.resultSet.getString("nicknameFollowed")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();

        return followUser;
    }

    public Follow create(Follow follow) {
        Follow newFollow = follow;
        String sql = " INSERT INTO FOLLOW"
                + " VALUES(" + newFollow.getIDFollowlist()+",'" 
                + newFollow.getTnumber() +"','"+newFollow.getNicknameFollowed()+"')";
        
        sql=sql.replace("'null'","null");
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
              ex.printStackTrace();
        }
        closeConnection();

        return newFollow;
    }

    public Follow update(Follow upFollow) {
        String sql = "UPDATE FOLLOW "
                +"SET TNUMBER='"+upFollow.getTnumber()+"',"
                +"NICKNAMEFOLLOWED='"+upFollow.getNicknameFollowed()+"'"
                + "WHERE ID_FOLLOWLIST="+upFollow.getIDFollowlist();
        
        sql=sql.replace("'null'","null");
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException e) {
              e.printStackTrace();
        }
        closeConnection();

        return upFollow;
    }

    public void delete(Follow follow) {
        String sql = "DELETE FROM FOLLOW WHERE ID_FOLLOWLIST = '"+follow.getIDFollowlist()+"'";
        
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
        }catch (SQLException ex) {
             ex.printStackTrace();
        }
    }

    public List<Follow> findAll() {
        List<Follow> followedList = new ArrayList();
        Follow follow = null;
        

        openConnection();
            try {
            this.resultSet = statement.executeQuery("SELECT * FROM FOLLOW");
            if (this.resultSet.next()) {
                follow = new Follow(
                        this.resultSet.getInt("id_Followlist"),
                        this.resultSet.getString("tnumber"),
                        this.resultSet.getString("nicknameFollowed")
                );
                followedList.add(follow);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();

        return followedList;
    }
    
        public int count(String tnumber){
        int count=0;
        String sql="SELECT COUNT(*) AS COUNT FROM FOLLOW WHERE TNUMBER ='"+tnumber+"'";
          openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
            count=this.resultSet.getInt("count");
            }
        }catch (SQLException ex) {
             ex.printStackTrace();
        }
          closeConnection();
        return count;
    }


}
