/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities_DAO;

import entities.LinkFollowersRecommendation_P;
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

public class LinkFollowersRecommendation_P_DAO {
	
	private String nameDriver = "jdbc:oracle:thin:@cp3dbinstance.c4pxnpz4ojk8.us-east-1.rds.amazonaws.com:1521:cp3db";
	private String username = "mm3";
	private String password = "mm3";
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
        
	public LinkFollowersRecommendation_P_DAO(){
    	
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
	
   	public LinkFollowersRecommendation_P find(int id) {
    	
            LinkFollowersRecommendation_P link = null;
            String sql = "SELECT * FROM LINK_FOLLOWERS_RECOMMEND_P WHERE ID_LINK = '" + id + "'";

            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
                    while (this.resultSet.next()) {
                    link = new LinkFollowersRecommendation_P(
                            this.resultSet.getInt("id_link"),
                            this.resultSet.getInt("id_recommendation_playlist"),
                            this.resultSet.getInt("id_followerlist")
                            );
                    }
            } catch (SQLException ex) {
                    System.out.println(ex.getErrorCode() + " error with the sql request.");
            }
            closeConnection();
            return link;
	}
        
	public LinkFollowersRecommendation_P create(LinkFollowersRecommendation_P linkToCreate) {
    	
            LinkFollowersRecommendation_P link = linkToCreate;
            String sql = " INSERT INTO LINK_FOLLOWERS_RECOMMEND_P(ID_LINK,ID_RECOMMENDATION_PLAYLIST,ID_FOLLOWERLIST)"
                    + "VALUES('" + linkToCreate.getId_link() + "','"
                    + linkToCreate.getId_recommendation_playlist() + "','" + linkToCreate.getId_followerlist() + "')";
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
	public LinkFollowersRecommendation_P update(LinkFollowersRecommendation_P linkToUpdate) {
    	
            String sql = " UPDATE LINK_FOLLOWERS_RECOMMEND_P SET ID_LINK = '" + linkToUpdate.getId_link()
                    + "', ID_RECOMMENDATION_PLAYLIST = '" + linkToUpdate.getId_recommendation_playlist()
                    + "', ID_FOLLOWERLIST = '" + linkToUpdate.getId_followerlist()+ "'";
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
        
	public LinkFollowersRecommendation_P delete(LinkFollowersRecommendation_P linkToDelete) {
    	
            String sql = "DELETE FROM LINK_FOLLOWERS_RECOMMEND_P WHERE ID_LINK = '" + linkToDelete.getId_link() + "'";
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
        
	public List<LinkFollowersRecommendation_P> findAll() {
    	
            List<LinkFollowersRecommendation_P> link_followers = new ArrayList();
            LinkFollowersRecommendation_P link = null;

            String sql="SELECT * FROM LINK_FOLLOWERS_RECOMMEND_P";
            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
                    while (this.resultSet.next()) {
                    link = new LinkFollowersRecommendation_P(
                            this.resultSet.getInt("id_link"),
                            this.resultSet.getInt("id_recommendation_playlist"),
                            this.resultSet.getInt("id_followerlist")
                            );
                    link_followers.add(link);
                    }
            } catch (SQLException ex) {
                    System.out.println(ex.getErrorCode() + " error with the sql request.");
            }
            closeConnection();


            return link_followers;
	}
	
}
