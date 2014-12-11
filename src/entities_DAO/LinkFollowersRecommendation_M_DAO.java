/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities_DAO;

import entities.LinkFollowersRecommendation_M;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author t00178764
 */

public class LinkFollowersRecommendation_M_DAO {
	
	private String nameDriver = "jdbc:oracle:thin:@cp3dbinstance.c4pxnpz4ojk8.us-east-1.rds.amazonaws.com:1521:cp3db";
	private String username = "mm3";
	private String password = "mm3";
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
        
	public LinkFollowersRecommendation_M_DAO(){
    	
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
	
	
   	public LinkFollowersRecommendation_M find(int id) {
    	
            LinkFollowersRecommendation_M link = null;
            String sql = "SELECT * FROM LINK_FOLLOWERS_RECOMMEND_M WHERE ID_LINK = " + id;

            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
                    while (this.resultSet.next()) {
                    link = new LinkFollowersRecommendation_M(
                            this.resultSet.getInt("id_link"),
                            this.resultSet.getInt("id_recommendation_music"),
                            this.resultSet.getInt("id_followerlist")
                    );
                    }
            } catch (SQLException ex) {
                    ex.printStackTrace();
            }
            closeConnection();
            return link;
	}
        
	public LinkFollowersRecommendation_M create(LinkFollowersRecommendation_M linkToCreate) {
    	
            LinkFollowersRecommendation_M link = linkToCreate;
            String sql = " INSERT INTO LINK_FOLLOWERS_RECOMMEND_M(ID_LINK,ID_RECOMMENDATION_MUSIC,ID_FOLLOWERLIST)"
                    + " VALUES(" + linkToCreate.getId_link() + ","
                    + linkToCreate.getId_recommendation_music() + "," + linkToCreate.getId_followerlist() + ")";
            System.out.println(sql);
            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
            } catch (SQLException ex) {
                    ex.printStackTrace();
            }
            closeConnection();
            return link;
	}
        
	public LinkFollowersRecommendation_M update(LinkFollowersRecommendation_M linkToUpdate) {
    	
            String sql = " UPDATE LINK_FOLLOWERS_RECOMMEND_M "
                    + " SET ID_RECOMMENDATION_MUSIC = " + linkToUpdate.getId_recommendation_music()
                    + ", ID_FOLLOWERLIST = " + linkToUpdate.getId_followerlist() 
                    + " WHERE ID_LINK = " + linkToUpdate.getId_link();
            
            sql=sql.replace("'null'","null");
            System.out.println(sql);
            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
            } catch (SQLException ex) {
                    ex.printStackTrace();
            }
            closeConnection();
            return linkToUpdate;
	}
        
	public LinkFollowersRecommendation_M delete(LinkFollowersRecommendation_M linkToDelete) {
    	
            String sql = "DELETE FROM LINK_FOLLOWERS_RECOMMEND_M WHERE ID_LINK = '" + linkToDelete.getId_link() + "'";
            System.out.println(sql);

            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
            } catch (SQLException ex) {
                    ex.printStackTrace();
            }
            
            closeConnection();
            return linkToDelete;
	}
        
	public List<LinkFollowersRecommendation_M> findAll() {
    	
            List<LinkFollowersRecommendation_M> link_followers = new ArrayList();
            LinkFollowersRecommendation_M link = null;

            String sql="SELECT * FROM LINK_FOLLOWERS_RECOMMEND_M";
            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
                    while (this.resultSet.next()) {
                    link = new LinkFollowersRecommendation_M(
                            this.resultSet.getInt("id_link"),
                            this.resultSet.getInt("id_recommendation_music"),
                            this.resultSet.getInt("id_followerlist")
                            );
                    link_followers.add(link);
                    }
            } catch (SQLException ex) {
                    ex.printStackTrace();
            }
            closeConnection();


            return link_followers;
	}
	
}

